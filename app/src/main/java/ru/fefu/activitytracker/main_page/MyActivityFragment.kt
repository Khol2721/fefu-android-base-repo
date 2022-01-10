package ru.fefu.activitytracker

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ru.fefu.activitytracker.databinding.ActivityMyFragmentBinding


class MyActivityFragment :
    BaseFragment<ActivityMyFragmentBinding>(R.layout.activity_my_fragment) {

    private val listRepository = MyListRepository()
    private val adapterItems = ItemAdapter(listRepository.getItem())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.rcView) {
            adapter = adapterItems
            layoutManager = LinearLayoutManager(requireContext())
        }

        adapterItems.setItemClickListener {
            val manager = activity?.supportFragmentManager?.findFragmentByTag("activityFragment")?.childFragmentManager
            manager?.beginTransaction()?.apply {
                manager.fragments.forEach(::hide)
                replace(
                    R.id.activity_fragment_switch_container,
                    MyActivityDetailsFragment.newInstance(listRepository.getItem()[it] as ListItem.Item)
                )
                addToBackStack(null)
                commit()
            }
        }

    }
}
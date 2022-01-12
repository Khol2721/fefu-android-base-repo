package ru.fefu.activitytracker

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ru.fefu.activitytracker.databinding.ActivityUsersFragmentBinding


class UsersActivityFragment : BaseFragment<ActivityUsersFragmentBinding>(R.layout.activity_users_fragment) {
    private val usersListRepository = UsersListRepository()
    private val adapterItems = ItemAdapter(usersListRepository.getItem())

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
                    UsersActivityDetails.newInstance(usersListRepository.getItem()[it] as ListItem.Item),
                    "tadUsers"
                )
                addToBackStack(null)
                commit()
            }
        }
    }



}
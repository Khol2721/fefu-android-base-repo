package ru.fefu.activitytracker

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ru.fefu.activitytracker.databinding.ActivityStartTrakingFragmentBinding

class StartTrackingFragment :
        BaseFragment<ActivityStartTrakingFragmentBinding>(R.layout.activity_start_traking_fragment) {
    private val listActivityTypes = ListActivityTypes()
    private val adapterTypes = NewActivityAdapter(listActivityTypes.getItem())

    companion object {
        fun newInstance(): StartTrackingFragment {
            return StartTrackingFragment()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.rcViewListTypes) {
            adapter = adapterTypes
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        binding.buttonStart.setOnClickListener {

            parentFragmentManager.beginTransaction().apply {
                replace(
                    R.id.fragment_container_map,
                    ProcessTrackingFragment.newInstance(),
                    "process_tracking"
                )
                addToBackStack(null)
                commit()
            }
        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
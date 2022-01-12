package ru.fefu.lesson7

import android.os.Bundle
import android.view.View
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.FragmentActivitiesBinding


class ActivitiesFragment : BaseFragment<FragmentActivitiesBinding>(R.layout.fragment_activities) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnDetails.setOnClickListener {
            (parentFragment as FlowFragment).getFlowFragmentManager().beginTransaction().apply {
                replace(R.id.container, ActivityDetailsFragment())
                addToBackStack(null)
                commit()
            }
        }
    }

}
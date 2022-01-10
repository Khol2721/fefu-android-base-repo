package ru.fefu.activitytracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.fefu.activitytracker.databinding.ActivityMyDetailsFragmentBinding

class MyActivityDetailsFragment(details: ListItem.Item) :
    BaseFragment<ActivityMyDetailsFragmentBinding>(R.layout.activity_my_details_fragment) {
    private var _binding: ActivityMyDetailsFragmentBinding? = null
    override val binding get() = _binding!!
    private val detail = details

    companion object {
        fun newInstance(info: ListItem.Item): MyActivityDetailsFragment {
            return MyActivityDetailsFragment(info)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textMyDistance.text = detail.distance
        binding.textMyDate.text = detail.date
        binding.textMyTime.text = detail.time
        binding.textMyStartTime.text = detail.startTime
        binding.textMyFinishTime.text = detail.endTime
        binding.toolbarMy.title = detail.activity
        binding.toolbarMy.setNavigationOnClickListener {
            activity?.onBackPressed()
        }

        binding.toolbarMy.setOnMenuItemClickListener {
            true
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ActivityMyDetailsFragmentBinding.inflate(inflater, container, false)
        return binding.root    }

}
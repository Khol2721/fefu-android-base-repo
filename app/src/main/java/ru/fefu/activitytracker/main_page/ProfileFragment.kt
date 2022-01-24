package ru.fefu.activitytracker.main_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.ActivityProfileFragmentBinding

class ProfileFragment : BaseFragment<ActivityProfileFragmentBinding>(R.layout.activity_profile_fragment) {
    private var _binding: ActivityProfileFragmentBinding? = null
    override val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ActivityProfileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.clickTextChangePassword.setOnClickListener {
            val manager = activity?.supportFragmentManager?.findFragmentByTag("profileFragment")?.childFragmentManager
            manager?.beginTransaction()?.apply {
                manager.fragments.forEach(::hide)
                replace(
                    R.id.fragment_container_profile_switch,
                    ChangePasswordFragment(),
                    "profile_change"
                )
                addToBackStack(null)
                commit()
            }
        }
    }
}
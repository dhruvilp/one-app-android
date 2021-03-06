package org.hackru.oneapp.hackru.ui.main.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import org.hackru.oneapp.hackru.R

class EventsFragment : android.support.v4.app.Fragment() {
    // TAG is used with Android's Log class to organize debugging logs
    val TAG = "EventsFragment"

    companion object {
        // Wondering why we use newInstance() instead of a constructor? Read this: https://stackoverflow.com/a/30867846/9968228
        fun newInstance() = EventsFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(R.layout.fragment_events, container, false)

}
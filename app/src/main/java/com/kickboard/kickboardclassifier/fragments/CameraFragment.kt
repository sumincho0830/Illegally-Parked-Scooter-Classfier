package com.kickboard.kickboardclassifier.fragments

import android.os.Bundle
import android.view.View
import androidx.camera.core.ImageCapture
import androidx.camera.view.PreviewView
import androidx.fragment.app.Fragment

class CameraFragment: Fragment() {
    private lateinit var cameraView: PreviewView // pre-built view in Android
    private lateinit var imageCapture: ImageCapture

    private lateinit var cameraFragment: CameraBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cameraView = view.findViewById()
    }
}
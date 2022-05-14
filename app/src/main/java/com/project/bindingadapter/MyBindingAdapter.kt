package com.project.bindingadapter

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class MyBindingAdapter {
    companion object {
        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(imageView : ImageView, url : String) {
            Glide.with(imageView.context)
                .load(url)
                .error(R.drawable.close_24)
                .into(imageView)
        }
    }
}


package au.edu.swin.sdmd.w06_multiples

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(val outputResult: Int) : Parcelable {
}
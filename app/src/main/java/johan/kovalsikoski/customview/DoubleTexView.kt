package johan.kovalsikoski.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.widget_double_textview.view.*

/**
 * @author Johan Vidal Kovalsikoski
 *
 * Since the code was made for improve UI loading, this can only be used with ConstraintLayout
 * It's possible to change this behavior by changing the merge tag for ConstraintLayout in layout/widget_double_textview.xml
 *
 * All the code for this Widget can be found in the following files:
 * - values/styles.xml
 * - values/attrs.xml
 * - layout/widget_double_textview.xml
 * - johan/kovalsikoski/customview/DoubleTexView.kt
 * */

class DoubleTexView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.widget_double_textview, this)

        if (attrs != null) {
            val styleable = context.obtainStyledAttributes(attrs, R.styleable.DoubleTexView)

            textViewTitle.text = styleable.getString(R.styleable.DoubleTexView_titleText)
            textViewSubtitle.text = styleable.getString(R.styleable.DoubleTexView_subtitleText)

            styleable.recycle()
        }

    }

    fun setTitle(text: String) {
        textViewTitle.text = text
    }

    fun setSubTitle(text: String) {
        textViewSubtitle.text = text
    }

}

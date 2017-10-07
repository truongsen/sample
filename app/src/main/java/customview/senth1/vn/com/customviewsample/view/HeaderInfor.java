package customview.senth1.vn.com.customviewsample.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import customview.senth1.vn.com.customviewsample.R;

/**
 * Created by truong on 10/9/2017.
 */

public class HeaderInfor extends LinearLayout {
    public HeaderInfor(Context context) {
        super(context);
        init(context, null, 0);
    }

    public HeaderInfor(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public HeaderInfor(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    public void init(Context context, AttributeSet attrs, int defStyleAttr) {
        LayoutInflater li = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.HeaderInfor, defStyleAttr, 0);
        li.inflate(R.layout.header, this, true);
        String text = a.getString(R.styleable.senthView_senthText);
        if (text != null) {
            ((TextView) findViewById(R.id.textView)).setText(text);
        }
        a.recycle();
    }
}

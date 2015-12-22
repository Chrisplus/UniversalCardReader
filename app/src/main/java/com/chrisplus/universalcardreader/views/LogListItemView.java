package com.chrisplus.universalcardreader.views;

import com.chrisplus.universalcardreader.R;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by chrisplus on 22/12/15.
 */
public class LogListItemView extends LinearLayout {

    private TextView sendCommandView;
    private TextView receiveCommandView;

    public LogListItemView(Context context) {
        super(context);
        init();
    }

    public LogListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LogListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_log_list_item, this, true);
        sendCommandView = (TextView) view.findViewById(R.id.log_send_command);
        receiveCommandView = (TextView) view.findViewById(R.id.log_receive_command);
    }

    public void setSendCommand(String sendCommand) {
        if (sendCommandView != null && !TextUtils.isEmpty(sendCommand)) {
            sendCommandView.setText(sendCommand);
        }
    }

    public void setReceiveCommand(String receiveCommand) {
        if (receiveCommandView != null && !TextUtils.isEmpty(receiveCommand)) {
            receiveCommandView.setText(receiveCommand);
        }
    }

    public void setContent(String sendCommand, String receiveCommand) {
        setSendCommand(sendCommand);
        setReceiveCommand(receiveCommand);
    }
}

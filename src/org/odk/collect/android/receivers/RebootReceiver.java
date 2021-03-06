package org.odk.collect.android.receivers;

import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RebootReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
        Collect.getInstance().getScheduledNotifications().initialize();
	}
}

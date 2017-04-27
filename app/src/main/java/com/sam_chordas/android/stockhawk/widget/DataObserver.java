package com.sam_chordas.android.stockhawk.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.database.ContentObserver;
import android.os.Handler;

import com.sam_chordas.android.stockhawk.R;

/**
 * Created by beetel on 11-12-2016.
 */
public class DataObserver extends ContentObserver {

    private AppWidgetManager widgetManager;
    private ComponentName mComponentName;

    public DataObserver(AppWidgetManager manager, ComponentName componentName, Handler handler) {
        super(handler);
        this.widgetManager = manager;
        this.mComponentName = componentName;

    }

    @Override
    public void onChange(boolean selfChange) {
        widgetManager.notifyAppWidgetViewDataChanged(widgetManager.getAppWidgetIds(mComponentName), R.id.list);
    }
}

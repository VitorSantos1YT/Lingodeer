package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.lingodeer.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class DaysOfWeekAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14337d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f14338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14340c;

    static {
        f14337d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public DaysOfWeekAdapter() {
        Calendar calendarG = UtcDates.g(null);
        this.f14338a = calendarG;
        this.f14339b = calendarG.getMaximum(7);
        this.f14340c = calendarG.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f14339b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i11) {
        int i12 = this.f14339b;
        if (i11 >= i12) {
            return null;
        }
        int i13 = i11 + this.f14340c;
        if (i13 > i12) {
            i13 -= i12;
        }
        return Integer.valueOf(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i12 = i11 + this.f14340c;
        int i13 = this.f14339b;
        if (i12 > i13) {
            i12 -= i13;
        }
        Calendar calendar = this.f14338a;
        calendar.set(7, i12);
        textView.setText(calendar.getDisplayName(7, f14337d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public DaysOfWeekAdapter(int i11) {
        Calendar calendarG = UtcDates.g(null);
        this.f14338a = calendarG;
        this.f14339b = calendarG.getMaximum(7);
        this.f14340c = i11;
    }
}

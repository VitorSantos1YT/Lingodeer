package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class MonthAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f14405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateSelector f14406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f14407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CalendarStyle f14408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f14409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f14410f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f14404t = UtcDates.g(null).getMaximum(4);
    public static final int H = (UtcDates.g(null).getMaximum(7) + UtcDates.g(null).getMaximum(5)) - 1;

    public MonthAdapter(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f14405a = month;
        this.f14406b = dateSelector;
        this.f14409e = calendarConstraints;
        this.f14410f = dayViewDecorator;
        this.f14407c = dateSelector.V0();
    }

    public final int a() {
        int firstDayOfWeek = this.f14409e.f14304e;
        Month month = this.f14405a;
        Calendar calendar = month.f14397a;
        int i11 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - firstDayOfWeek;
        return i12 < 0 ? i12 + month.f14400d : i12;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i11) {
        if (i11 < a() || i11 > c()) {
            return null;
        }
        int iA = (i11 - a()) + 1;
        Calendar calendarC = UtcDates.c(this.f14405a.f14397a);
        calendarC.set(5, iA);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f14405a.f14401e) - 1;
    }

    public final void d(TextView textView, long j11, int i11) {
        boolean z11;
        boolean z12;
        CalendarItemStyle calendarItemStyle;
        Object obj;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z13 = true;
        boolean z14 = UtcDates.f().getTimeInMillis() == j11;
        DateSelector dateSelector = this.f14406b;
        ArrayList arrayListA = dateSelector.A();
        int size = arrayListA.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                z11 = false;
                break;
            }
            Object obj2 = arrayListA.get(i12);
            i12++;
            Object obj3 = ((y4.b) obj2).f57088a;
            if (obj3 != null && ((Long) obj3).longValue() == j11) {
                z11 = true;
                break;
            }
        }
        ArrayList arrayListA2 = dateSelector.A();
        int size2 = arrayListA2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                z12 = false;
                break;
            }
            Object obj4 = arrayListA2.get(i13);
            i13++;
            Object obj5 = ((y4.b) obj4).f57089b;
            if (obj5 != null && ((Long) obj5).longValue() == j11) {
                z12 = true;
                break;
            }
        }
        Calendar calendarF = UtcDates.f();
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(j11);
        String str = calendarF.get(1) == calendarG.get(1) ? UtcDates.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j11)) : UtcDates.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j11));
        if (z14) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z11) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z12) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f14409e.f14302c.L0(j11)) {
            textView.setEnabled(true);
            ArrayList arrayListV0 = dateSelector.V0();
            int size3 = arrayListV0.size();
            int i14 = 0;
            do {
                if (i14 >= size3) {
                    z13 = false;
                    break;
                } else {
                    obj = arrayListV0.get(i14);
                    i14++;
                }
            } while (UtcDates.a(j11) != UtcDates.a(((Long) obj).longValue()));
            textView.setSelected(z13);
            if (z13) {
                calendarItemStyle = this.f14408d.f14317b;
            } else {
                calendarItemStyle = UtcDates.f().getTimeInMillis() == j11 ? this.f14408d.f14318c : this.f14408d.f14316a;
            }
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.f14408d.f14322g;
        }
        if (this.f14410f == null || i11 == -1) {
            calendarItemStyle.b(textView);
            return;
        }
        int i15 = this.f14405a.f14399c;
        calendarItemStyle.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j11) {
        Month monthB = Month.b(j11);
        Month month = this.f14405a;
        if (monthB.equals(month)) {
            Calendar calendarC = UtcDates.c(month.f14397a);
            calendarC.setTimeInMillis(j11);
            int i11 = calendarC.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i11 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j11, i11);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return H;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11 / this.f14405a.f14400d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        int i12;
        Context context = viewGroup.getContext();
        if (this.f14408d == null) {
            this.f14408d = new CalendarStyle(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i11 - a();
        if (iA >= 0) {
            Month month = this.f14405a;
            if (iA >= month.f14401e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i12 = -1;
            } else {
                i12 = iA + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i12)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i12 = -1;
        }
        Long item = getItem(i11);
        if (item == null) {
            return textView;
        }
        d(textView, item.longValue(), i12);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}

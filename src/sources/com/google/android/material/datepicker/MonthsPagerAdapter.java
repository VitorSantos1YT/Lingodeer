package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.n1;
import com.lingodeer.R;
import dt.Xk.wuoM;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import z4.f0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class MonthsPagerAdapter extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CalendarConstraints f14411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateSelector f14412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DayViewDecorator f14413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCalendar.AnonymousClass3 f14414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14415e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ViewHolder extends g2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f14418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MaterialCalendarGridView f14419b;

        public ViewHolder(LinearLayout linearLayout, boolean z11) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f14418a = textView;
            WeakHashMap weakHashMap = s0.f58893a;
            new f0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
            this.f14419b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z11) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        return this.f14411a.f14306t;
    }

    @Override // androidx.recyclerview.widget.b1
    public final long getItemId(int i11) {
        Calendar calendarC = UtcDates.c(this.f14411a.f14300a.f14397a);
        calendarC.add(2, i11);
        return new Month(calendarC).f14397a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(g2 g2Var, int i11) {
        ViewHolder viewHolder = (ViewHolder) g2Var;
        CalendarConstraints calendarConstraints = this.f14411a;
        Calendar calendarC = UtcDates.c(calendarConstraints.f14300a.f14397a);
        calendarC.add(2, i11);
        Month month = new Month(calendarC);
        viewHolder.f14418a.setText(month.c());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.f14419b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().f14405a)) {
            MonthAdapter monthAdapter = new MonthAdapter(month, this.f14412b, calendarConstraints, this.f14413c);
            materialCalendarGridView.setNumColumns(month.f14400d);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            MonthAdapter monthAdapterA = materialCalendarGridView.a();
            DateSelector dateSelector = monthAdapterA.f14406b;
            Iterator it = monthAdapterA.f14407c.iterator();
            while (it.hasNext()) {
                monthAdapterA.e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (dateSelector != null) {
                ArrayList arrayListV0 = dateSelector.V0();
                int size = arrayListV0.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayListV0.get(i12);
                    i12++;
                    monthAdapterA.e(materialCalendarGridView, ((Long) obj).longValue());
                }
                monthAdapterA.f14407c = dateSelector.V0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i13, long j11) {
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                MonthAdapter monthAdapterA2 = materialCalendarGridView2.a();
                if (i13 < monthAdapterA2.a() || i13 > monthAdapterA2.c()) {
                    return;
                }
                MaterialCalendar.AnonymousClass3 anonymousClass3 = MonthsPagerAdapter.this.f14414d;
                long jLongValue = materialCalendarGridView2.a().getItem(i13).longValue();
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                if (materialCalendar.f14343d.f14302c.L0(jLongValue)) {
                    materialCalendar.f14342c.q1(jLongValue);
                    Iterator it2 = materialCalendar.f14420a.iterator();
                    while (it2.hasNext()) {
                        ((OnSelectionChangedListener) it2.next()).b(materialCalendar.f14342c.a1());
                    }
                    materialCalendar.L.getAdapter().notifyDataSetChanged();
                    RecyclerView recyclerView = materialCalendar.K;
                    if (recyclerView != null) {
                        recyclerView.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.b1
    public final g2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.x(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new n1(-1, this.f14415e));
        return new ViewHolder(linearLayout, true);
    }

    public MonthsPagerAdapter(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.AnonymousClass3 anonymousClass3) {
        int dimensionPixelSize;
        Month month = calendarConstraints.f14300a;
        Month month2 = calendarConstraints.f14301b;
        Month month3 = calendarConstraints.f14303d;
        if (month.f14397a.compareTo(month3.f14397a) <= 0) {
            if (month3.f14397a.compareTo(month2.f14397a) <= 0) {
                int dimensionPixelSize2 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * MonthAdapter.f14404t;
                if (MaterialDatePicker.x(contextThemeWrapper, android.R.attr.windowFullscreen)) {
                    dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    dimensionPixelSize = 0;
                }
                this.f14415e = dimensionPixelSize2 + dimensionPixelSize;
                this.f14411a = calendarConstraints;
                this.f14412b = dateSelector;
                this.f14413c = dayViewDecorator;
                this.f14414d = anonymousClass3;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException(wuoM.pcAslThcG);
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }
}

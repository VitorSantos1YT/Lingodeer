package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class YearGridAdapter extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCalendar f14428a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ViewHolder extends g2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f14431a;

        public ViewHolder(TextView textView) {
            super(textView);
            this.f14431a = textView;
        }
    }

    public YearGridAdapter(MaterialCalendar materialCalendar) {
        this.f14428a = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        return this.f14428a.f14343d.f14305f;
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(g2 g2Var, int i11) {
        ViewHolder viewHolder = (ViewHolder) g2Var;
        MaterialCalendar materialCalendar = this.f14428a;
        final int i12 = materialCalendar.f14343d.f14300a.f14399c + i11;
        viewHolder.f14431a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i12)));
        TextView textView = viewHolder.f14431a;
        Context context = textView.getContext();
        textView.setContentDescription(UtcDates.f().get(1) == i12 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i12)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i12)));
        CalendarStyle calendarStyle = materialCalendar.H;
        Calendar calendarF = UtcDates.f();
        CalendarItemStyle calendarItemStyle = calendarF.get(1) == i12 ? calendarStyle.f14321f : calendarStyle.f14319d;
        ArrayList arrayListV0 = materialCalendar.f14342c.V0();
        int size = arrayListV0.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListV0.get(i13);
            i13++;
            calendarF.setTimeInMillis(((Long) obj).longValue());
            if (calendarF.get(1) == i12) {
                calendarItemStyle = calendarStyle.f14320e;
            }
        }
        calendarItemStyle.b(textView);
        textView.setSelected(calendarItemStyle == calendarStyle.f14320e);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialCalendar materialCalendar2 = YearGridAdapter.this.f14428a;
                Month monthA = Month.a(i12, materialCalendar2.f14345f.f14398b);
                CalendarConstraints calendarConstraints = materialCalendar2.f14343d;
                Month month = calendarConstraints.f14301b;
                Month month2 = calendarConstraints.f14300a;
                Calendar calendar = monthA.f14397a;
                if (calendar.compareTo(month2.f14397a) < 0) {
                    monthA = month2;
                } else if (calendar.compareTo(month.f14397a) > 0) {
                    monthA = month;
                }
                materialCalendar2.r(monthA);
                materialCalendar2.s(MaterialCalendar.CalendarSelector.DAY);
                MaterialButton materialButton = materialCalendar2.Q;
                if (materialButton != null) {
                    materialButton.sendAccessibilityEvent(8);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.b1
    public final g2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}

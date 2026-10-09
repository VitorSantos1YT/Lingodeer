package com.google.android.material.datepicker;

import a5.g;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Calendar;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f14363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14364b;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends z4.b {
        @Override // z4.b
        public final void d(View view, g gVar) {
            this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
            gVar.n(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f14363a = UtcDates.g(null);
        if (MaterialDatePicker.x(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.lingodeer.R.id.cancel_button);
            setNextFocusRightId(com.lingodeer.R.id.confirm_button);
        }
        this.f14364b = MaterialDatePicker.x(getContext(), com.lingodeer.R.attr.nestedScrollable);
        s0.q(this, new AnonymousClass1());
    }

    public final MonthAdapter a() {
        return (MonthAdapter) super.getAdapter();
    }

    public final View b(int i11) {
        return getChildAt(i11 - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((MonthAdapter) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i11;
        int iA;
        int iC;
        int iA2;
        int iC2;
        int i12;
        int width;
        int right;
        this = this;
        super.onDraw(canvas);
        MonthAdapter monthAdapter = (MonthAdapter) super.getAdapter();
        DateSelector dateSelector = monthAdapter.f14406b;
        Month month = monthAdapter.f14405a;
        CalendarStyle calendarStyle = monthAdapter.f14408d;
        int iMax = Math.max(monthAdapter.a(), this.getFirstVisiblePosition());
        int iMin = Math.min(monthAdapter.c(), this.getLastVisiblePosition());
        Long item = monthAdapter.getItem(iMax);
        Long item2 = monthAdapter.getItem(iMin);
        ArrayList arrayListA = dateSelector.A();
        int size = arrayListA.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListA.get(i13);
            i13++;
            y4.b bVar = (y4.b) obj;
            Object obj2 = bVar.f57088a;
            Object obj3 = bVar.f57089b;
            if (obj2 == null) {
                this = this;
            } else if (obj3 != null) {
                Long l9 = (Long) obj2;
                long jLongValue = l9.longValue();
                Long l11 = (Long) obj3;
                i13 = i13;
                long jLongValue2 = l11.longValue();
                if (item == null || item2 == null || l9.longValue() > item2.longValue() || l11.longValue() < item.longValue()) {
                    i11 = iMax;
                    month = month;
                    arrayListA = arrayListA;
                    monthAdapter = monthAdapter;
                } else {
                    boolean z11 = this.getLayoutDirection() == 1;
                    long jLongValue3 = item.longValue();
                    Calendar calendar = this.f14363a;
                    if (jLongValue < jLongValue3) {
                        if (iMax % month.f14400d == 0) {
                            right = 0;
                        } else {
                            right = !z11 ? this.b(iMax - 1).getRight() : this.b(iMax - 1).getLeft();
                        }
                        i11 = iMax;
                        iC = right;
                        iA = i11;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iA = monthAdapter.a() + (calendar.get(5) - 1);
                        View viewB = this.b(iA);
                        i11 = iMax;
                        iC = d.c(viewB, 2, viewB.getLeft());
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if ((iMin + 1) % month.f14400d == 0) {
                            iC2 = this.getWidth();
                        } else {
                            iC2 = !z11 ? this.b(iMin).getRight() : this.b(iMin).getLeft();
                        }
                        iA2 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iA2 = monthAdapter.a() + (calendar.get(5) - 1);
                        View viewB2 = this.b(iA2);
                        iC2 = d.c(viewB2, 2, viewB2.getLeft());
                    }
                    int i14 = iC;
                    Month month2 = month;
                    int itemId = (int) monthAdapter.getItemId(iA);
                    int itemId2 = (int) monthAdapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = this.getNumColumns() * itemId;
                        MonthAdapter monthAdapter2 = monthAdapter;
                        int numColumns2 = (this.getNumColumns() + numColumns) - 1;
                        View viewB3 = this.b(numColumns);
                        int top = viewB3.getTop() + calendarStyle.f14316a.f14310a.top;
                        int i15 = itemId2;
                        int bottom = viewB3.getBottom() - calendarStyle.f14316a.f14310a.bottom;
                        if (z11) {
                            int i16 = iA2 > numColumns2 ? 0 : iC2;
                            int width2 = numColumns > iA ? getWidth() : i14;
                            i12 = i16;
                            width = width2;
                        } else {
                            i12 = numColumns > iA ? 0 : i14;
                            width = iA2 > numColumns2 ? getWidth() : iC2;
                        }
                        canvas.drawRect(i12, top, width, bottom, calendarStyle.f14323h);
                        itemId++;
                        this = this;
                        monthAdapter = monthAdapter2;
                        itemId2 = i15;
                    }
                    month = month2;
                    arrayListA = arrayListA;
                }
                iMax = i11;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (!z11) {
            super.onFocusChanged(false, i11, rect);
            return;
        }
        if (i11 == 33) {
            setSelection(((MonthAdapter) super.getAdapter()).c());
        } else if (i11 == 130) {
            setSelection(((MonthAdapter) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i11, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (!super.onKeyDown(i11, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((MonthAdapter) super.getAdapter()).a() && selectedItemPosition <= ((MonthAdapter) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i11) {
            return false;
        }
        setSelection(((MonthAdapter) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i11, int i12) {
        if (!this.f14364b) {
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i11) {
        if (i11 < ((MonthAdapter) super.getAdapter()).a()) {
            super.setSelection(((MonthAdapter) super.getAdapter()).a());
        } else {
            super.setSelection(i11);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}

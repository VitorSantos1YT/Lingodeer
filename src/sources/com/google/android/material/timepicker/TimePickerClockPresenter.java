package com.google.android.material.timepicker;

import a5.g;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.lingodeer.R;
import java.util.Locale;
import ko.Zea.ealNNtLp;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimePickerView f15805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeModel f15806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15809e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f15803f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String[] f15804t = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    public static final String[] H = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.f15805a = timePickerView;
        this.f15806b = timeModel;
        if (timeModel.f15798c == 0) {
            timePickerView.W.setVisibility(0);
        }
        timePickerView.U.L.add(this);
        timePickerView.f15834b0 = this;
        timePickerView.f15833a0 = this;
        timePickerView.U.T = this;
        f("%d", f15803f);
        f("%d", f15804t);
        f("%02d", H);
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void a() {
        this.f15805a.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public final void b(float f5, boolean z11) {
        if (this.f15809e || z11) {
            return;
        }
        TimeModel timeModel = this.f15806b;
        int i11 = timeModel.f15799d;
        int i12 = timeModel.f15800e;
        int iRound = Math.round(f5);
        int i13 = timeModel.f15801f;
        TimePickerView timePickerView = this.f15805a;
        if (i13 == 12) {
            int i14 = ((iRound + 3) / 6) % 60;
            timeModel.f15800e = i14;
            this.f15807c = (float) Math.floor(i14 * 6);
        } else {
            int i15 = (iRound + 15) / 30;
            if (timeModel.f15798c == 1) {
                i15 %= 12;
                if (timePickerView.V.V.W == 2) {
                    i15 += 12;
                }
            }
            timeModel.c(i15);
            this.f15808d = (timeModel.b() * 30) % 360;
        }
        e();
        if (timeModel.f15800e == i12 && timeModel.f15799d == i11) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void c() {
        this.f15805a.setVisibility(8);
    }

    public final void d(int i11, boolean z11) {
        String[] strArr;
        int i12;
        boolean z12 = i11 == 12;
        TimePickerView timePickerView = this.f15805a;
        ClockHandView clockHandView = timePickerView.U;
        Chip chip = timePickerView.T;
        Chip chip2 = timePickerView.S;
        ClockFaceView clockFaceView = timePickerView.V;
        clockHandView.f15774d = z12;
        TimeModel timeModel = this.f15806b;
        timeModel.f15801f = i11;
        int i13 = timeModel.f15798c;
        if (z12) {
            strArr = H;
        } else {
            strArr = i13 == 1 ? f15804t : f15803f;
        }
        if (z12) {
            i12 = R.string.material_minute_suffix;
        } else {
            i12 = i13 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
        }
        clockFaceView.s(strArr, i12);
        int i14 = (timeModel.f15801f == 10 && i13 == 1 && timeModel.f15799d >= 12) ? 2 : 1;
        ClockHandView clockHandView2 = clockFaceView.V;
        clockHandView2.W = i14;
        clockHandView2.invalidate();
        timePickerView.U.c(z12 ? this.f15807c : this.f15808d, z11);
        boolean z13 = i11 == 12;
        chip2.setChecked(z13);
        chip2.setAccessibilityLiveRegion(z13 ? 2 : 0);
        boolean z14 = i11 == 10;
        chip.setChecked(z14);
        chip.setAccessibilityLiveRegion(z14 ? 2 : 0);
        s0.q(chip, new ClickActionDelegate(timePickerView.getContext()) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, z4.b
            public final void d(View view, g gVar) {
                super.d(view, gVar);
                Resources resources = view.getResources();
                TimeModel timeModel2 = TimePickerClockPresenter.this.f15806b;
                gVar.p(resources.getString(timeModel2.f15798c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel2.b())));
            }
        });
        s0.q(chip2, new ClickActionDelegate(timePickerView.getContext()) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, z4.b
            public final void d(View view, g gVar) {
                super.d(view, gVar);
                gVar.p(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.f15806b.f15800e)));
            }
        });
    }

    public final void f(String str, String[] strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = TimeModel.a(this.f15805a.getResources(), strArr[i11], str);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void invalidate() {
        TimeModel timeModel = this.f15806b;
        this.f15808d = (timeModel.b() * 30) % 360;
        this.f15807c = timeModel.f15800e * 6;
        d(timeModel.f15801f, false);
        e();
    }

    public final void e() {
        TimeModel timeModel = this.f15806b;
        int i11 = timeModel.f15802t;
        int iB = timeModel.b();
        int i12 = timeModel.f15800e;
        TimePickerView timePickerView = this.f15805a;
        Chip chip = timePickerView.T;
        Chip chip2 = timePickerView.S;
        timePickerView.W.f(i11 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        Object[] objArr = {Integer.valueOf(i12)};
        String str = ealNNtLp.MCMFfOASri;
        String str2 = String.format(locale, str, objArr);
        String str3 = String.format(locale, str, Integer.valueOf(iB));
        if (!TextUtils.equals(chip2.getText(), str2)) {
            chip2.setText(str2);
        }
        if (TextUtils.equals(chip.getText(), str3)) {
            return;
        }
        chip.setText(str3);
    }
}

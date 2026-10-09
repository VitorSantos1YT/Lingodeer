package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.y;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.lingodeer.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialTimePicker extends y implements TimePickerView.OnDoubleTapListener {
    public TimePickerView W;
    public ViewStub X;
    public TimePickerClockPresenter Y;
    public TimePickerTextInputPresenter Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Object f15778a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f15779b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f15780c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public CharSequence f15782e0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public CharSequence f15784g0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public CharSequence f15786i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public MaterialButton f15787j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Button f15788k0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public TimeModel f15790m0;
    public final LinkedHashSet S = new LinkedHashSet();
    public final LinkedHashSet T = new LinkedHashSet();
    public final LinkedHashSet U = new LinkedHashSet();
    public final LinkedHashSet V = new LinkedHashSet();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f15781d0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f15783f0 = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f15785h0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f15789l0 = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f15791n0 = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
        public Builder() {
            new TimeModel();
        }
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f15790m0 = timeModel;
        if (timeModel == null) {
            this.f15790m0 = new TimeModel();
        }
        this.f15789l0 = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f15790m0.f15798c != 1 ? 0 : 1);
        this.f15781d0 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f15782e0 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f15783f0 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f15784g0 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f15785h0 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f15786i0 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f15791n0 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.W = timePickerView;
        timePickerView.f15835c0 = this;
        this.X = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f15787j0 = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i11 = this.f15781d0;
        if (i11 != 0) {
            textView.setText(i11);
        } else if (!TextUtils.isEmpty(this.f15782e0)) {
            textView.setText(this.f15782e0);
        }
        v(this.f15787j0);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                Iterator it = materialTimePicker.S.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                materialTimePicker.q(false, false);
            }
        });
        int i12 = this.f15783f0;
        if (i12 != 0) {
            button.setText(i12);
        } else if (!TextUtils.isEmpty(this.f15784g0)) {
            button.setText(this.f15784g0);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f15788k0 = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                Iterator it = materialTimePicker.T.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                materialTimePicker.q(false, false);
            }
        });
        int i13 = this.f15785h0;
        if (i13 != 0) {
            this.f15788k0.setText(i13);
        } else if (!TextUtils.isEmpty(this.f15786i0)) {
            this.f15788k0.setText(this.f15786i0);
        }
        Button button3 = this.f15788k0;
        if (button3 != null) {
            button3.setVisibility(this.f1875t ? 0 : 8);
        }
        this.f15787j0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                materialTimePicker.f15789l0 = materialTimePicker.f15789l0 == 0 ? 1 : 0;
                materialTimePicker.v(materialTimePicker.f15787j0);
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15778a0 = null;
        this.Y = null;
        this.Z = null;
        TimePickerView timePickerView = this.W;
        if (timePickerView != null) {
            timePickerView.f15835c0 = null;
            this.W = null;
        }
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.V.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f15790m0);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f15789l0);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f15781d0);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f15782e0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f15783f0);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f15784g0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f15785h0);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f15786i0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f15791n0);
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f15778a0 instanceof TimePickerTextInputPresenter) {
            view.postDelayed(new b(this, 0), 100L);
        }
    }

    @Override // androidx.fragment.app.y
    public final Dialog r(Bundle bundle) {
        Context contextRequireContext = requireContext();
        int i11 = this.f15791n0;
        if (i11 == 0) {
            TypedValue typedValueA = MaterialAttributes.a(requireContext(), R.attr.materialTimePickerTheme);
            i11 = typedValueA == null ? 0 : typedValueA.data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i11);
        Context context = dialog.getContext();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.P, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.f15780c0 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f15779b0 = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        materialShapeDrawable.n(context);
        materialShapeDrawable.r(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.q(window.getDecorView().getElevation());
        return dialog;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.material.timepicker.TimePickerPresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.timepicker.TimePickerPresenter, java.lang.Object] */
    public final void v(MaterialButton materialButton) {
        TimePickerPresenter timePickerPresenter;
        Pair pair;
        TimePickerClockPresenter timePickerClockPresenter;
        if (materialButton == null || this.W == null || this.X == null) {
            return;
        }
        ?? r9 = this.f15778a0;
        if (r9 != 0) {
            r9.c();
        }
        int i11 = this.f15789l0;
        TimePickerView timePickerView = this.W;
        ViewStub viewStub = this.X;
        if (i11 == 0) {
            TimePickerClockPresenter timePickerClockPresenter2 = this.Y;
            if (timePickerClockPresenter2 == null) {
                timePickerClockPresenter = timePickerClockPresenter2;
                timePickerClockPresenter = new TimePickerClockPresenter(timePickerView, this.f15790m0);
            }
            timePickerClockPresenter = timePickerClockPresenter2;
            this.Y = timePickerClockPresenter;
            timePickerPresenter = timePickerClockPresenter;
        } else {
            if (this.Z == null) {
                this.Z = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.f15790m0);
            }
            TimePickerTextInputPresenter timePickerTextInputPresenter = this.Z;
            timePickerTextInputPresenter.f15820e.setChecked(false);
            timePickerTextInputPresenter.f15821f.setChecked(false);
            timePickerPresenter = this.Z;
        }
        this.f15778a0 = timePickerPresenter;
        timePickerPresenter.a();
        this.f15778a0.invalidate();
        int i12 = this.f15789l0;
        if (i12 == 0) {
            pair = new Pair(Integer.valueOf(this.f15779b0), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException(p.j(i12, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.f15780c0), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }
}

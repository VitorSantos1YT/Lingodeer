package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.k1;
import androidx.fragment.app.y;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import cf.x;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.lingodeer.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import jh.h;
import tp.g;
import z4.a2;
import z4.j0;
import z4.s0;
import z4.u;
import z4.v1;
import z4.w1;
import z4.x1;
import z4.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialDatePicker<S> extends y {
    public final LinkedHashSet S = new LinkedHashSet();
    public final LinkedHashSet T = new LinkedHashSet();
    public final LinkedHashSet U = new LinkedHashSet();
    public final LinkedHashSet V = new LinkedHashSet();
    public int W;
    public DateSelector X;
    public PickerFragment Y;
    public CalendarConstraints Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public DayViewDecorator f14365a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public MaterialCalendar f14366b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f14367c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CharSequence f14368d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f14369e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f14370f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f14371g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public CharSequence f14372h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f14373i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CharSequence f14374j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f14375k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public CharSequence f14376l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f14377m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public CharSequence f14378n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public TextView f14379o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f14380p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CheckableImageButton f14381q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MaterialShapeDrawable f14382r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Button f14383s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f14384t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public CharSequence f14385u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CharSequence f14386v0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder<S> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    public static int w(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(UtcDates.f());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i11 = month.f14400d;
        return ((i11 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i11) + (dimensionPixelOffset * 2);
    }

    public static boolean x(Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.d(R.attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i11});
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z11;
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
        this.W = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.X = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.Z = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f14365a0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f14367c0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f14368d0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f14370f0 = bundle.getInt("INPUT_MODE_KEY");
        this.f14371g0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14372h0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f14373i0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f14374j0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f14375k0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14376l0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f14377m0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f14378n0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f14368d0;
        if (text == null) {
            text = requireContext().getResources().getText(this.f14367c0);
        }
        this.f14385u0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f14386v0 = text;
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f14369e0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f14369e0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(w(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(w(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f14380p0 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f14381q0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f14379o0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f14381q0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f14381q0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, h.k(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], h.k(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f14381q0.setChecked(this.f14370f0 != 0);
        s0.q(this.f14381q0, null);
        z(this.f14381q0);
        final int i11 = 2;
        this.f14381q0.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MaterialDatePicker f14439b;

            {
                this.f14439b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        MaterialDatePicker materialDatePicker = this.f14439b;
                        for (MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener : materialDatePicker.S) {
                            materialDatePicker.v().getClass();
                            materialPickerOnPositiveButtonClickListener.a();
                        }
                        materialDatePicker.q(false, false);
                        break;
                    case 1:
                        MaterialDatePicker materialDatePicker2 = this.f14439b;
                        Iterator it = materialDatePicker2.T.iterator();
                        while (it.hasNext()) {
                            ((View.OnClickListener) it.next()).onClick(view);
                        }
                        materialDatePicker2.q(false, false);
                        break;
                    default:
                        MaterialDatePicker materialDatePicker3 = this.f14439b;
                        materialDatePicker3.f14383s0.setEnabled(materialDatePicker3.v().P0());
                        materialDatePicker3.f14381q0.toggle();
                        materialDatePicker3.f14370f0 = materialDatePicker3.f14370f0 == 1 ? 0 : 1;
                        materialDatePicker3.z(materialDatePicker3.f14381q0);
                        materialDatePicker3.y();
                        break;
                }
            }
        });
        this.f14383s0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (v().P0()) {
            this.f14383s0.setEnabled(true);
        } else {
            this.f14383s0.setEnabled(false);
        }
        this.f14383s0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f14372h0;
        if (charSequence != null) {
            this.f14383s0.setText(charSequence);
        } else {
            int i12 = this.f14371g0;
            if (i12 != 0) {
                this.f14383s0.setText(i12);
            }
        }
        CharSequence charSequence2 = this.f14374j0;
        if (charSequence2 != null) {
            this.f14383s0.setContentDescription(charSequence2);
        } else if (this.f14373i0 != 0) {
            this.f14383s0.setContentDescription(getContext().getResources().getText(this.f14373i0));
        }
        final int i13 = 0;
        this.f14383s0.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MaterialDatePicker f14439b;

            {
                this.f14439b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        MaterialDatePicker materialDatePicker = this.f14439b;
                        for (MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener : materialDatePicker.S) {
                            materialDatePicker.v().getClass();
                            materialPickerOnPositiveButtonClickListener.a();
                        }
                        materialDatePicker.q(false, false);
                        break;
                    case 1:
                        MaterialDatePicker materialDatePicker2 = this.f14439b;
                        Iterator it = materialDatePicker2.T.iterator();
                        while (it.hasNext()) {
                            ((View.OnClickListener) it.next()).onClick(view);
                        }
                        materialDatePicker2.q(false, false);
                        break;
                    default:
                        MaterialDatePicker materialDatePicker3 = this.f14439b;
                        materialDatePicker3.f14383s0.setEnabled(materialDatePicker3.v().P0());
                        materialDatePicker3.f14381q0.toggle();
                        materialDatePicker3.f14370f0 = materialDatePicker3.f14370f0 == 1 ? 0 : 1;
                        materialDatePicker3.z(materialDatePicker3.f14381q0);
                        materialDatePicker3.y();
                        break;
                }
            }
        });
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f14376l0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i14 = this.f14375k0;
            if (i14 != 0) {
                button.setText(i14);
            }
        }
        CharSequence charSequence4 = this.f14378n0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f14377m0 != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f14377m0));
        }
        final int i15 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MaterialDatePicker f14439b;

            {
                this.f14439b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        MaterialDatePicker materialDatePicker = this.f14439b;
                        for (MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener : materialDatePicker.S) {
                            materialDatePicker.v().getClass();
                            materialPickerOnPositiveButtonClickListener.a();
                        }
                        materialDatePicker.q(false, false);
                        break;
                    case 1:
                        MaterialDatePicker materialDatePicker2 = this.f14439b;
                        Iterator it = materialDatePicker2.T.iterator();
                        while (it.hasNext()) {
                            ((View.OnClickListener) it.next()).onClick(view);
                        }
                        materialDatePicker2.q(false, false);
                        break;
                    default:
                        MaterialDatePicker materialDatePicker3 = this.f14439b;
                        materialDatePicker3.f14383s0.setEnabled(materialDatePicker3.v().P0());
                        materialDatePicker3.f14381q0.toggle();
                        materialDatePicker3.f14370f0 = materialDatePicker3.f14370f0 == 1 ? 0 : 1;
                        materialDatePicker3.z(materialDatePicker3.f14381q0);
                        materialDatePicker3.y();
                        break;
                }
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.V.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onStart() {
        x x1Var;
        x x1Var2;
        super.onStart();
        Dialog dialog = this.N;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f14369e0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f14382r0);
            if (!this.f14384t0) {
                final View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListD = DrawableUtils.d(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
                boolean z11 = false;
                boolean z12 = numValueOf == null || numValueOf.intValue() == 0;
                int iB = MaterialColors.b(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z12) {
                    numValueOf = Integer.valueOf(iB);
                }
                android.support.v4.media.session.a.I(window, false);
                window.getContext();
                Context context = window.getContext();
                int i11 = Build.VERSION.SDK_INT;
                int iE = i11 < 27 ? r4.c.e(MaterialColors.b(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                boolean z13 = MaterialColors.e(0) || MaterialColors.e(numValueOf.intValue());
                g gVar = new g(window.getDecorView());
                if (i11 >= 35) {
                    x1Var = new a2(window, gVar);
                } else if (i11 >= 30) {
                    x1Var = new y1(window, gVar);
                } else {
                    x1Var = i11 >= 26 ? new x1(window, gVar) : new w1(window, gVar);
                }
                x1Var.K(z13);
                boolean zE = MaterialColors.e(iB);
                if (MaterialColors.e(iE) || (iE == 0 && zE)) {
                    z11 = true;
                }
                g gVar2 = new g(window.getDecorView());
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 35) {
                    x1Var2 = new a2(window, gVar2);
                } else if (i12 >= 30) {
                    x1Var2 = new y1(window, gVar2);
                } else {
                    x1Var2 = i12 >= 26 ? new x1(window, gVar2) : new w1(window, gVar2);
                }
                x1Var2.J(z11);
                final int paddingTop = viewFindViewById.getPaddingTop();
                final int paddingLeft = viewFindViewById.getPaddingLeft();
                final int paddingRight = viewFindViewById.getPaddingRight();
                final int i13 = viewFindViewById.getLayoutParams().height;
                u uVar = new u() { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
                    @Override // z4.u
                    public final v1 e(View view, v1 v1Var) {
                        r4.d dVarG = v1Var.f58905a.g(519);
                        View view2 = viewFindViewById;
                        int i14 = i13;
                        if (i14 >= 0) {
                            view2.getLayoutParams().height = i14 + dVarG.f48794b;
                            view2.setLayoutParams(view2.getLayoutParams());
                        }
                        view2.setPadding(paddingLeft + dVarG.f48793a, paddingTop + dVarG.f48794b, paddingRight + dVarG.f48795c, view2.getPaddingBottom());
                        return v1Var;
                    }
                };
                WeakHashMap weakHashMap = s0.f58893a;
                j0.m(viewFindViewById, uVar);
                this.f14384t0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f14382r0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.N;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new InsetDialogOnTouchListener(dialog2, rect));
        }
        y();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onStop() {
        this.Y.f14420a.clear();
        super.onStop();
    }

    @Override // androidx.fragment.app.y
    public final Dialog r(Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iI0 = this.W;
        if (iI0 == 0) {
            iI0 = v().I0(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iI0);
        Context context = dialog.getContext();
        this.f14369e0 = x(context, android.R.attr.windowFullscreen);
        this.f14382r0 = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.E, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f14382r0.n(context);
        this.f14382r0.r(ColorStateList.valueOf(color));
        this.f14382r0.q(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final DateSelector v() {
        if (this.X == null) {
            this.X = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.X;
    }

    public final void y() {
        Context contextRequireContext = requireContext();
        int iI0 = this.W;
        if (iI0 == 0) {
            iI0 = v().I0(contextRequireContext);
        }
        DateSelector dateSelectorV = v();
        CalendarConstraints calendarConstraints = this.Z;
        DayViewDecorator dayViewDecorator = this.f14365a0;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iI0);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorV);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f14303d);
        materialCalendar.setArguments(bundle);
        this.f14366b0 = materialCalendar;
        PickerFragment pickerFragment = materialCalendar;
        if (this.f14370f0 == 1) {
            DateSelector dateSelectorV2 = v();
            CalendarConstraints calendarConstraints2 = this.Z;
            MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iI0);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorV2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            materialTextInputPicker.setArguments(bundle2);
            pickerFragment = materialTextInputPicker;
        }
        this.Y = pickerFragment;
        this.f14379o0.setText((this.f14370f0 == 1 && getResources().getConfiguration().orientation == 2) ? this.f14386v0 : this.f14385u0);
        String strV = v().v(getContext());
        this.f14380p0.setContentDescription(v().C0(requireContext()));
        this.f14380p0.setText(strV);
        k1 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.e(R.id.mtrl_calendar_frame, this.Y, null);
        aVar.j();
        this.Y.q(new OnSelectionChangedListener<Object>() { // from class: com.google.android.material.datepicker.MaterialDatePicker.2
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void a() {
                MaterialDatePicker.this.f14383s0.setEnabled(false);
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void b(Object obj) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                String strV2 = materialDatePicker.v().v(materialDatePicker.getContext());
                materialDatePicker.f14380p0.setContentDescription(materialDatePicker.v().C0(materialDatePicker.requireContext()));
                materialDatePicker.f14380p0.setText(strV2);
                materialDatePicker.f14383s0.setEnabled(materialDatePicker.v().P0());
            }
        });
    }

    public final void z(CheckableImageButton checkableImageButton) {
        this.f14381q0.setContentDescription(this.f14370f0 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        Month month;
        Month monthB;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.W);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.X);
        CalendarConstraints calendarConstraints = this.Z;
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        int i11 = CalendarConstraints.Builder.f14307c;
        int i12 = CalendarConstraints.Builder.f14307c;
        builder.f14309b = new DateValidatorPointForward(Long.MIN_VALUE);
        long j11 = calendarConstraints.f14300a.f14402f;
        long j12 = calendarConstraints.f14301b.f14402f;
        builder.f14308a = Long.valueOf(calendarConstraints.f14303d.f14402f);
        int i13 = calendarConstraints.f14304e;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f14302c;
        builder.f14309b = dateValidator;
        MaterialCalendar materialCalendar = this.f14366b0;
        if (materialCalendar == null) {
            month = null;
        } else {
            month = materialCalendar.f14345f;
        }
        if (month != null) {
            builder.f14308a = Long.valueOf(month.f14402f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthB2 = Month.b(j11);
        Month monthB3 = Month.b(j12);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l9 = builder.f14308a;
        if (l9 == null) {
            monthB = null;
        } else {
            monthB = Month.b(l9.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthB2, monthB3, dateValidator2, monthB, i13));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f14365a0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f14367c0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f14368d0);
        bundle.putInt("INPUT_MODE_KEY", this.f14370f0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f14371g0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f14372h0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f14373i0);
        bundle.putCharSequence(DytezVyM.bgSgO, this.f14374j0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f14375k0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f14376l0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f14377m0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f14378n0);
    }
}

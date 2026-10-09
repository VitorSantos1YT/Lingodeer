package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import bq.x;
import com.afollestad.materialdialogs.internal.main.BaseSubLayout;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.m;
import lc.h;
import qx.p;
import ry.l;
import ry.r;
import vc.a;
import vc.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogActionButtonLayout extends BaseSubLayout {
    public final int H;
    public final int K;
    public boolean L;
    public DialogActionButton[] M;
    public AppCompatCheckBox N;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7406f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7407t;

    public DialogActionButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7405e = c.a(this, R.dimen.md_action_button_frame_padding) - c.a(this, R.dimen.md_action_button_inset_horizontal);
        this.f7406f = c.a(this, R.dimen.md_action_button_frame_padding_neutral);
        this.f7407t = c.a(this, R.dimen.md_action_button_frame_spec_height);
        this.H = c.a(this, R.dimen.md_checkbox_prompt_margin_vertical);
        this.K = c.a(this, R.dimen.md_checkbox_prompt_margin_horizontal);
    }

    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.M;
        if (dialogActionButtonArr != null) {
            return dialogActionButtonArr;
        }
        m.n("actionButtons");
        throw null;
    }

    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.N;
        if (appCompatCheckBox != null) {
            return appCompatCheckBox;
        }
        m.n("checkBoxPrompt");
        throw null;
    }

    public final boolean getStackButtons$core() {
        return this.L;
    }

    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.M;
        if (dialogActionButtonArr == null) {
            m.n("actionButtons");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
            if (a.s(dialogActionButton)) {
                arrayList.add(dialogActionButton);
            }
        }
        Object[] array = arrayList.toArray(new DialogActionButton[0]);
        if (array != null) {
            return (DialogActionButton[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredWidth(), getDividerHeight(), a());
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        h hVar;
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.md_button_positive);
        m.b(viewFindViewById, "findViewById(R.id.md_button_positive)");
        View viewFindViewById2 = findViewById(R.id.md_button_negative);
        m.b(viewFindViewById2, "findViewById(R.id.md_button_negative)");
        View viewFindViewById3 = findViewById(R.id.md_button_neutral);
        m.b(viewFindViewById3, "findViewById(R.id.md_button_neutral)");
        this.M = new DialogActionButton[]{(DialogActionButton) viewFindViewById, (DialogActionButton) viewFindViewById2, (DialogActionButton) viewFindViewById3};
        View viewFindViewById4 = findViewById(R.id.md_checkbox_prompt);
        m.b(viewFindViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.N = (AppCompatCheckBox) viewFindViewById4;
        DialogActionButton[] dialogActionButtonArr = this.M;
        if (dialogActionButtonArr == null) {
            m.n("actionButtons");
            throw null;
        }
        int length = dialogActionButtonArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            DialogActionButton dialogActionButton = dialogActionButtonArr[i11];
            h.Companion.getClass();
            if (i11 == 0) {
                hVar = h.POSITIVE;
            } else if (i11 == 1) {
                hVar = h.NEGATIVE;
            } else {
                if (i11 != 2) {
                    throw new IndexOutOfBoundsException(w4.c.f(i11, " is not an action button index."));
                }
                hVar = h.NEUTRAL;
            }
            dialogActionButton.setOnClickListener(new x(1, this, hVar));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        List listL0;
        int measuredWidth;
        int measuredHeight;
        if (p.F(this)) {
            AppCompatCheckBox appCompatCheckBox = this.N;
            if (appCompatCheckBox == null) {
                m.n("checkBoxPrompt");
                throw null;
            }
            if (a.s(appCompatCheckBox)) {
                boolean zR = a.r(this);
                int i15 = this.H;
                int measuredWidth2 = this.K;
                if (zR) {
                    measuredWidth = getMeasuredWidth() - measuredWidth2;
                    AppCompatCheckBox appCompatCheckBox2 = this.N;
                    if (appCompatCheckBox2 == null) {
                        m.n("checkBoxPrompt");
                        throw null;
                    }
                    measuredWidth2 = measuredWidth - appCompatCheckBox2.getMeasuredWidth();
                    AppCompatCheckBox appCompatCheckBox3 = this.N;
                    if (appCompatCheckBox3 == null) {
                        m.n("checkBoxPrompt");
                        throw null;
                    }
                    measuredHeight = appCompatCheckBox3.getMeasuredHeight();
                } else {
                    AppCompatCheckBox appCompatCheckBox4 = this.N;
                    if (appCompatCheckBox4 == null) {
                        m.n("checkBoxPrompt");
                        throw null;
                    }
                    measuredWidth = appCompatCheckBox4.getMeasuredWidth() + measuredWidth2;
                    AppCompatCheckBox appCompatCheckBox5 = this.N;
                    if (appCompatCheckBox5 == null) {
                        m.n("checkBoxPrompt");
                        throw null;
                    }
                    measuredHeight = appCompatCheckBox5.getMeasuredHeight();
                }
                int i16 = measuredHeight + i15;
                AppCompatCheckBox appCompatCheckBox6 = this.N;
                if (appCompatCheckBox6 == null) {
                    m.n("checkBoxPrompt");
                    throw null;
                }
                appCompatCheckBox6.layout(measuredWidth2, i15, measuredWidth, i16);
            }
            boolean z12 = this.L;
            int i17 = this.f7407t;
            int i18 = this.f7405e;
            if (z12) {
                int measuredWidth3 = getMeasuredWidth() - i18;
                int measuredHeight2 = getMeasuredHeight();
                DialogActionButton[] visibleButtons = getVisibleButtons();
                m.f(visibleButtons, "<this>");
                if (visibleButtons.length == 0) {
                    listL0 = r.f50854a;
                } else {
                    listL0 = l.l0(visibleButtons);
                    Collections.reverse(listL0);
                }
                Iterator it = listL0.iterator();
                while (it.hasNext()) {
                    int i19 = measuredHeight2 - i17;
                    ((DialogActionButton) it.next()).layout(i18, i19, measuredWidth3, measuredHeight2);
                    measuredHeight2 = i19;
                }
                return;
            }
            int measuredHeight3 = getMeasuredHeight() - i17;
            int measuredHeight4 = getMeasuredHeight();
            boolean zR2 = a.r(this);
            int i21 = this.f7406f;
            if (zR2) {
                DialogActionButton[] dialogActionButtonArr = this.M;
                if (dialogActionButtonArr == null) {
                    m.n("actionButtons");
                    throw null;
                }
                if (a.s(dialogActionButtonArr[2])) {
                    DialogActionButton[] dialogActionButtonArr2 = this.M;
                    if (dialogActionButtonArr2 == null) {
                        m.n("actionButtons");
                        throw null;
                    }
                    DialogActionButton dialogActionButton = dialogActionButtonArr2[2];
                    int measuredWidth4 = getMeasuredWidth() - i21;
                    dialogActionButton.layout(measuredWidth4 - dialogActionButton.getMeasuredWidth(), measuredHeight3, measuredWidth4, measuredHeight4);
                }
                DialogActionButton[] dialogActionButtonArr3 = this.M;
                if (dialogActionButtonArr3 == null) {
                    m.n("actionButtons");
                    throw null;
                }
                if (a.s(dialogActionButtonArr3[0])) {
                    DialogActionButton[] dialogActionButtonArr4 = this.M;
                    if (dialogActionButtonArr4 == null) {
                        m.n("actionButtons");
                        throw null;
                    }
                    DialogActionButton dialogActionButton2 = dialogActionButtonArr4[0];
                    int measuredWidth5 = dialogActionButton2.getMeasuredWidth() + i18;
                    dialogActionButton2.layout(i18, measuredHeight3, measuredWidth5, measuredHeight4);
                    i18 = measuredWidth5;
                }
                DialogActionButton[] dialogActionButtonArr5 = this.M;
                if (dialogActionButtonArr5 == null) {
                    m.n("actionButtons");
                    throw null;
                }
                if (a.s(dialogActionButtonArr5[1])) {
                    DialogActionButton[] dialogActionButtonArr6 = this.M;
                    if (dialogActionButtonArr6 == null) {
                        m.n("actionButtons");
                        throw null;
                    }
                    DialogActionButton dialogActionButton3 = dialogActionButtonArr6[1];
                    dialogActionButton3.layout(i18, measuredHeight3, dialogActionButton3.getMeasuredWidth() + i18, measuredHeight4);
                    return;
                }
                return;
            }
            DialogActionButton[] dialogActionButtonArr7 = this.M;
            if (dialogActionButtonArr7 == null) {
                m.n("actionButtons");
                throw null;
            }
            if (a.s(dialogActionButtonArr7[2])) {
                DialogActionButton[] dialogActionButtonArr8 = this.M;
                if (dialogActionButtonArr8 == null) {
                    m.n("actionButtons");
                    throw null;
                }
                DialogActionButton dialogActionButton4 = dialogActionButtonArr8[2];
                dialogActionButton4.layout(i21, measuredHeight3, dialogActionButton4.getMeasuredWidth() + i21, measuredHeight4);
            }
            int measuredWidth6 = getMeasuredWidth() - i18;
            DialogActionButton[] dialogActionButtonArr9 = this.M;
            if (dialogActionButtonArr9 == null) {
                m.n("actionButtons");
                throw null;
            }
            if (a.s(dialogActionButtonArr9[0])) {
                DialogActionButton[] dialogActionButtonArr10 = this.M;
                if (dialogActionButtonArr10 == null) {
                    m.n("actionButtons");
                    throw null;
                }
                DialogActionButton dialogActionButton5 = dialogActionButtonArr10[0];
                int measuredWidth7 = measuredWidth6 - dialogActionButton5.getMeasuredWidth();
                dialogActionButton5.layout(measuredWidth7, measuredHeight3, measuredWidth6, measuredHeight4);
                measuredWidth6 = measuredWidth7;
            }
            DialogActionButton[] dialogActionButtonArr11 = this.M;
            if (dialogActionButtonArr11 == null) {
                m.n("actionButtons");
                throw null;
            }
            if (a.s(dialogActionButtonArr11[1])) {
                DialogActionButton[] dialogActionButtonArr12 = this.M;
                if (dialogActionButtonArr12 == null) {
                    m.n("actionButtons");
                    throw null;
                }
                DialogActionButton dialogActionButton6 = dialogActionButtonArr12[1];
                dialogActionButton6.layout(measuredWidth6 - dialogActionButton6.getMeasuredWidth(), measuredHeight3, measuredWidth6, measuredHeight4);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        if (!p.F(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        AppCompatCheckBox appCompatCheckBox = this.N;
        if (appCompatCheckBox == null) {
            m.n("checkBoxPrompt");
            throw null;
        }
        if (a.s(appCompatCheckBox)) {
            int i14 = size - (this.K * 2);
            AppCompatCheckBox appCompatCheckBox2 = this.N;
            if (appCompatCheckBox2 == null) {
                m.n("checkBoxPrompt");
                throw null;
            }
            appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        Context context = getDialog().getContext();
        m.b(context, "dialog.context");
        Context context2 = getDialog().O;
        DialogActionButton[] visibleButtons = getVisibleButtons();
        int length = visibleButtons.length;
        int i15 = 0;
        while (true) {
            i13 = this.f7407t;
            if (i15 >= length) {
                break;
            }
            DialogActionButton dialogActionButton = visibleButtons[i15];
            dialogActionButton.a(context, context2, this.L);
            if (this.L) {
                dialogActionButton.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
            } else {
                dialogActionButton.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
            }
            i15++;
        }
        if (!(getVisibleButtons().length == 0) && !this.L) {
            int measuredWidth = 0;
            for (DialogActionButton dialogActionButton2 : getVisibleButtons()) {
                measuredWidth += dialogActionButton2.getMeasuredWidth();
            }
            if (measuredWidth >= size && !this.L) {
                this.L = true;
                for (DialogActionButton dialogActionButton3 : getVisibleButtons()) {
                    dialogActionButton3.a(context, context2, true);
                    dialogActionButton3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                }
            }
        }
        int length2 = getVisibleButtons().length != 0 ? this.L ? getVisibleButtons().length * i13 : i13 : 0;
        AppCompatCheckBox appCompatCheckBox3 = this.N;
        if (appCompatCheckBox3 == null) {
            m.n("checkBoxPrompt");
            throw null;
        }
        if (a.s(appCompatCheckBox3)) {
            AppCompatCheckBox appCompatCheckBox4 = this.N;
            if (appCompatCheckBox4 == null) {
                m.n("checkBoxPrompt");
                throw null;
            }
            length2 += (this.H * 2) + appCompatCheckBox4.getMeasuredHeight();
        }
        setMeasuredDimension(size, length2);
    }

    public final void setActionButtons(DialogActionButton[] dialogActionButtonArr) {
        this.M = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(AppCompatCheckBox appCompatCheckBox) {
        this.N = appCompatCheckBox;
    }

    public final void setStackButtons$core(boolean z11) {
        this.L = z11;
    }
}

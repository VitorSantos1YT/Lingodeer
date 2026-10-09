package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import q.l;
import q.n;
import q.w;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements w, AbsListView.SelectionBoundsAdjuster {
    public ImageView H;
    public LinearLayout K;
    public final Drawable L;
    public final int M;
    public final Context N;
    public boolean O;
    public final Drawable P;
    public final boolean Q;
    public LayoutInflater R;
    public boolean S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f841f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f842t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.R == null) {
            this.R = LayoutInflater.from(getContext());
        }
        return this.R;
    }

    private void setSubMenuArrowVisible(boolean z11) {
        ImageView imageView = this.f842t;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.H;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.H.getLayoutParams();
        rect.top = this.H.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // q.w
    public final void c(n nVar) {
        boolean z11;
        int i11;
        String string;
        boolean z12;
        this.f836a = nVar;
        boolean zIsVisible = nVar.isVisible();
        l lVar = nVar.P;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(nVar.f47298e);
        setCheckable(nVar.isCheckable());
        if (lVar.o()) {
            if ((lVar.n() ? nVar.L : nVar.H) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        lVar.n();
        if (z11) {
            n nVar2 = this.f836a;
            l lVar2 = nVar2.P;
            if (lVar2.o()) {
                if ((lVar2.n() ? nVar2.L : nVar2.H) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            i11 = z12 ? 0 : 8;
        }
        if (i11 == 0) {
            TextView textView = this.f841f;
            n nVar3 = this.f836a;
            l lVar3 = nVar3.P;
            Context context = lVar3.f47280a;
            char c11 = lVar3.n() ? nVar3.L : nVar3.H;
            if (c11 == 0) {
                string = BuildConfig.VERSION_NAME;
            } else {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i12 = lVar3.n() ? nVar3.M : nVar3.K;
                n.c(i12, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                n.c(i12, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                n.c(i12, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                n.c(i12, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                n.c(i12, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                n.c(i12, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                if (c11 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c11 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c11 != ' ') {
                    sb2.append(c11);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f841f.getVisibility() != i11) {
            this.f841f.setVisibility(i11);
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.S);
    }

    @Override // q.w
    public n getItemData() {
        return this.f836a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.L);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f839d = textView;
        int i11 = this.M;
        if (i11 != -1) {
            textView.setTextAppearance(this.N, i11);
        }
        this.f841f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f842t = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.P);
        }
        this.H = (ImageView) findViewById(R.id.group_divider);
        this.K = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        if (this.f837b != null && this.O) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f837b.getLayoutParams();
            int i13 = layoutParams.height;
            if (i13 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i13;
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setCheckable(boolean z11) {
        CompoundButton compoundButton;
        View view;
        if (!z11 && this.f838c == null && this.f840e == null) {
            return;
        }
        if ((this.f836a.Z & 4) != 0) {
            if (this.f838c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f838c = radioButton;
                LinearLayout linearLayout = this.K;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f838c;
            view = this.f840e;
        } else {
            if (this.f840e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f840e = checkBox;
                LinearLayout linearLayout2 = this.K;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f840e;
            view = this.f838c;
        }
        if (z11) {
            compoundButton.setChecked(this.f836a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f840e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f838c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z11) {
        CompoundButton compoundButton;
        if ((this.f836a.Z & 4) != 0) {
            if (this.f838c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f838c = radioButton;
                LinearLayout linearLayout = this.K;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f838c;
        } else {
            if (this.f840e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f840e = checkBox;
                LinearLayout linearLayout2 = this.K;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f840e;
        }
        compoundButton.setChecked(z11);
    }

    public void setForceShowIcon(boolean z11) {
        this.S = z11;
        this.O = z11;
    }

    public void setGroupDividerEnabled(boolean z11) {
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setVisibility((this.Q || !z11) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        l lVar = this.f836a.P;
        boolean z11 = this.S;
        if (z11 || this.O) {
            ImageView imageView = this.f837b;
            if (imageView == null && drawable == null && !this.O) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f837b = imageView2;
                LinearLayout linearLayout = this.K;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.O) {
                this.f837b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f837b;
            if (!z11) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f837b.getVisibility() != 0) {
                this.f837b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f839d.getVisibility() != 8) {
                this.f839d.setVisibility(8);
            }
        } else {
            this.f839d.setText(charSequence);
            if (this.f839d.getVisibility() != 0) {
                this.f839d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        m4 m4VarK = m4.k(getContext(), attributeSet, k.a.f37417t, i11);
        this.L = m4VarK.g(5);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        this.M = typedArray.getResourceId(1, -1);
        this.O = typedArray.getBoolean(7, false);
        this.N = context;
        this.P = m4VarK.g(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.Q = typedArrayObtainStyledAttributes.hasValue(0);
        m4VarK.l();
        typedArrayObtainStyledAttributes.recycle();
    }
}

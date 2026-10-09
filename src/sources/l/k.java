package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;
import r.k1;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 implements DialogInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f39024f;

    public k(ContextThemeWrapper contextThemeWrapper, int i11) {
        super(contextThemeWrapper, e(contextThemeWrapper, i11));
        this.f39024f = new i(getContext(), this, getWindow());
    }

    public static int e(Context context, int i11) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // l.b0, f.o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i11;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        i iVar = this.f39024f;
        iVar.f38992b.setContentView(iVar.f39015z);
        Context context = iVar.f38991a;
        Window window = iVar.f38993c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = iVar.f38997g;
        if (view == null) {
            view = null;
        }
        boolean z11 = view != null;
        if (!z11 || !i.a(view)) {
            window.setFlags(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE, OSSConstants.DEFAULT_STREAM_BUFFER_SIZE);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (iVar.f38998h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (iVar.f38996f != null) {
                ((LinearLayout.LayoutParams) ((k1) viewGroup.getLayoutParams())).weight = CropImageView.DEFAULT_ASPECT_RATIO;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = i.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = i.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = i.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        iVar.f39007r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        iVar.f39007r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        iVar.f39011v = textView;
        if (textView != null) {
            CharSequence charSequence = iVar.f38995e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                iVar.f39007r.removeView(iVar.f39011v);
                if (iVar.f38996f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) iVar.f39007r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(iVar.f39007r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(iVar.f38996f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        iVar.f38999i = button;
        h9.l0 l0Var = iVar.G;
        button.setOnClickListener(l0Var);
        if (TextUtils.isEmpty(iVar.f39000j)) {
            iVar.f38999i.setVisibility(8);
            i11 = 0;
        } else {
            iVar.f38999i.setText(iVar.f39000j);
            iVar.f38999i.setVisibility(0);
            i11 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        iVar.f39002l = button2;
        button2.setOnClickListener(l0Var);
        if (TextUtils.isEmpty(iVar.m)) {
            iVar.f39002l.setVisibility(8);
        } else {
            iVar.f39002l.setText(iVar.m);
            iVar.f39002l.setVisibility(0);
            i11 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        iVar.f39004o = button3;
        button3.setOnClickListener(l0Var);
        if (TextUtils.isEmpty(iVar.f39005p)) {
            iVar.f39004o.setVisibility(8);
        } else {
            iVar.f39004o.setText(iVar.f39005p);
            iVar.f39004o.setVisibility(0);
            i11 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i11 == 1) {
                Button button4 = iVar.f38999i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i11 == 2) {
                Button button5 = iVar.f39002l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i11 == 4) {
                Button button6 = iVar.f39004o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i11 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (iVar.f39012w != null) {
            viewGroupB.addView(iVar.f39012w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            iVar.f39009t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(iVar.f38994d) || !iVar.E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                iVar.f39009t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                iVar.f39010u = textView2;
                textView2.setText(iVar.f38994d);
                Drawable drawable = iVar.f39008s;
                if (drawable != null) {
                    iVar.f39009t.setImageDrawable(drawable);
                } else {
                    iVar.f39010u.setPadding(iVar.f39009t.getPaddingLeft(), iVar.f39009t.getPaddingTop(), iVar.f39009t.getPaddingRight(), iVar.f39009t.getPaddingBottom());
                    iVar.f39009t.setVisibility(8);
                }
            }
        }
        boolean z12 = viewGroup.getVisibility() != 8;
        int i12 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z13 = viewGroupB3.getVisibility() != 8;
        if (!z13 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i12 != 0) {
            NestedScrollView nestedScrollView2 = iVar.f39007r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (iVar.f38995e == null && iVar.f38996f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = iVar.f38996f;
        if (alertController$RecycleListView != null && (!z13 || i12 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i12 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f792a, alertController$RecycleListView.getPaddingRight(), z13 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f793b);
        }
        if (!z12) {
            View view2 = iVar.f38996f;
            if (view2 == null) {
                view2 = iVar.f39007r;
            }
            if (view2 != null) {
                int i13 = z13 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = s0.f58893a;
                z4.k0.b(view2, i12 | i13, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = iVar.f38996f;
        if (alertController$RecycleListView2 == null || (listAdapter = iVar.f39013x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i14 = iVar.f39014y;
        if (i14 > -1) {
            alertController$RecycleListView2.setItemChecked(i14, true);
            alertController$RecycleListView2.setSelection(i14);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f39024f.f39007r;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i11, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f39024f.f39007r;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i11, keyEvent);
        }
        return true;
    }

    @Override // l.b0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        i iVar = this.f39024f;
        iVar.f38994d = charSequence;
        TextView textView = iVar.f39010u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

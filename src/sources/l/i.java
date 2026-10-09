package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.lingodeer.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final g F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f38992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f38993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f38994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f38995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f38996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f38997g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f38999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f39000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Message f39001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f39002l;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Message f39003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f39004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f39005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f39006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollView f39007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f39008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f39009t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f39010u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f39011v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f39012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f39013x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f39015z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38998h = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f39014y = -1;
    public final h9.l0 G = new h9.l0(this, 1);

    public i(Context context, k kVar, Window window) {
        this.f38991a = context;
        this.f38992b = kVar;
        this.f38993c = window;
        g gVar = new g();
        gVar.f38981b = new WeakReference(kVar);
        this.F = gVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, k.a.f37404f, R.attr.alertDialogStyle, 0);
        this.f39015z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.E = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        kVar.c().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.F.obtainMessage(i11, onClickListener) : null;
        if (i11 == -3) {
            this.f39005p = charSequence;
            this.f39006q = messageObtainMessage;
        } else if (i11 == -2) {
            this.m = charSequence;
            this.f39003n = messageObtainMessage;
        } else {
            if (i11 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f39000j = charSequence;
            this.f39001k = messageObtainMessage;
        }
    }
}

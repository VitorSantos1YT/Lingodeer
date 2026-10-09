package me;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.lingodeer.R;
import java.util.ArrayList;
import le.i;
import pe.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f41120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f41121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Animatable f41122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41123d;

    public a(ImageView imageView, int i11) {
        this.f41123d = i11;
        f.c(imageView, "Argument must not be null");
        this.f41120a = imageView;
        this.f41121b = new e(imageView);
    }

    @Override // ie.i
    public final void a() {
        Animatable animatable = this.f41122c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // me.d
    public final void b(i iVar) {
        this.f41121b.f41129b.remove(iVar);
    }

    @Override // me.d
    public final void c(Drawable drawable) {
        j(null);
        this.f41122c = null;
        this.f41120a.setImageDrawable(drawable);
    }

    @Override // me.d
    public final void d(i iVar) {
        e eVar = this.f41121b;
        ArrayList arrayList = eVar.f41129b;
        View view = eVar.f41128a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = eVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = eVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            iVar.l(iA, iA2);
            return;
        }
        if (!arrayList.contains(iVar)) {
            arrayList.add(iVar);
        }
        if (eVar.f41130c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            l4.f fVar = new l4.f(eVar);
            eVar.f41130c = fVar;
            viewTreeObserver.addOnPreDrawListener(fVar);
        }
    }

    @Override // me.d
    public final void e(Object obj, ne.c cVar) {
        if (cVar != null && cVar.a(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.f41122c = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.f41122c = animatable;
            animatable.start();
            return;
        }
        j(obj);
        if (!(obj instanceof Animatable)) {
            this.f41122c = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.f41122c = animatable2;
        animatable2.start();
    }

    @Override // me.d
    public final void f(Drawable drawable) {
        j(null);
        this.f41122c = null;
        this.f41120a.setImageDrawable(drawable);
    }

    @Override // me.d
    public final le.c g() {
        Object tag = this.f41120a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof le.c) {
            return (le.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // me.d
    public final void h(Drawable drawable) {
        e eVar = this.f41121b;
        ViewTreeObserver viewTreeObserver = eVar.f41128a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(eVar.f41130c);
        }
        eVar.f41130c = null;
        eVar.f41129b.clear();
        Animatable animatable = this.f41122c;
        if (animatable != null) {
            animatable.stop();
        }
        j(null);
        this.f41122c = null;
        this.f41120a.setImageDrawable(drawable);
    }

    @Override // me.d
    public final void i(le.c cVar) {
        this.f41120a.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    public final void j(Object obj) {
        switch (this.f41123d) {
            case 0:
                this.f41120a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f41120a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // ie.i
    public final void onStart() {
        Animatable animatable = this.f41122c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final String toString() {
        return "Target for: " + this.f41120a;
    }

    @Override // ie.i
    public final void onDestroy() {
    }
}

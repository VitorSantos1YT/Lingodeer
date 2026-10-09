package l;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends f.o implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.b f38939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f38940e;

    /* JADX WARN: Type inference failed for: r2v2, types: [l.a0] */
    public b0(Context context, int i11) {
        int i12;
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i12 = typedValue.resourceId;
        } else {
            i12 = i11;
        }
        super(context, i12);
        this.f38940e = new z4.l() { // from class: l.a0
            @Override // z4.l
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f38938a.d(keyEvent);
            }
        };
        androidx.appcompat.app.a aVarC = c();
        if (i11 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i11 = typedValue2.resourceId;
        }
        ((androidx.appcompat.app.b) aVarC).f822v0 = i11;
        aVarC.d();
    }

    @Override // f.o, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) c();
        bVar.x();
        ((ViewGroup) bVar.f803c0.findViewById(android.R.id.content)).addView(view, layoutParams);
        bVar.O.a(bVar.N.getCallback());
    }

    public final androidx.appcompat.app.a c() {
        if (this.f38939d == null) {
            pb.j jVar = androidx.appcompat.app.a.f794a;
            this.f38939d = new androidx.appcompat.app.b(getContext(), getWindow(), this, this);
        }
        return this.f38939d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v10.c.h(this.f38940e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i11) {
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) c();
        bVar.x();
        return bVar.N.findViewById(i11);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().a();
    }

    @Override // f.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) c();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(bVar.M);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(bVar);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        c().d();
    }

    @Override // f.o, android.app.Dialog
    public final void onStop() {
        super.onStop();
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) c();
        bVar.B();
        a aVar = bVar.Q;
        if (aVar != null) {
            aVar.r(false);
        }
    }

    @Override // l.n
    public final p.c onWindowStartingSupportActionMode(p.b bVar) {
        return null;
    }

    @Override // f.o, android.app.Dialog
    public void setContentView(int i11) {
        b();
        c().h(i11);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().m(charSequence);
    }

    @Override // f.o, android.app.Dialog
    public void setContentView(View view) {
        b();
        c().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i11) {
        super.setTitle(i11);
        c().m(getContext().getString(i11));
    }

    @Override // f.o, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().k(view, layoutParams);
    }

    @Override // l.n
    public final void onSupportActionModeFinished(p.c cVar) {
    }

    @Override // l.n
    public final void onSupportActionModeStarted(p.c cVar) {
    }
}

package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f38947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f38948d;

    public d0(View view, String str) {
        this.f38945a = view;
        this.f38946b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f38947c != null) {
            break;
        }
        View view2 = this.f38945a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f38946b;
            if (context == null) {
                int id2 = view2.getId();
                if (id2 == -1) {
                    str = BuildConfig.VERSION_NAME;
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                }
                StringBuilder sbQ = p0.q("Could not find method ", str2, kHfjNGauVgdF.ApBBiU);
                sbQ.append(view2.getClass());
                sbQ.append(str);
                throw new IllegalStateException(sbQ.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f38947c = method;
                    this.f38948d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f38947c.invoke(this.f38948d, view);
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}

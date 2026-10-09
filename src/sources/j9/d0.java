package j9;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f36185b = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f36186a = new LinkedHashMap();

    public final void a(c0 navigator) {
        kotlin.jvm.internal.m.f(navigator, "navigator");
        String strU = com.bumptech.glide.e.u(navigator.getClass());
        if (strU.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f36186a;
        c0 c0Var = (c0) linkedHashMap.get(strU);
        if (kotlin.jvm.internal.m.a(c0Var, navigator)) {
            return;
        }
        if (c0Var != null && c0Var.f36184b) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + c0Var).toString());
        }
        if (!navigator.f36184b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final c0 b(String str) {
        kotlin.jvm.internal.m.f(str, scqhIrGXy.CCkq);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        c0 c0Var = (c0) this.f36186a.get(str);
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException(ep.a.g("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}

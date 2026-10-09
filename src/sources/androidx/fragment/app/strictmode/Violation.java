package androidx.fragment.app.strictmode;

import androidx.fragment.app.k0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f1834a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(k0 fragment, String str) {
        super(str);
        m.f(fragment, "fragment");
        this.f1834a = fragment;
    }
}

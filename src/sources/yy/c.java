package yy;

import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f58371a;

    public c(Enum[] entries) {
        m.f(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        m.c(componentType);
        this.f58371a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f58371a.getEnumConstants();
        m.e(enumConstants, "getEnumConstants(...)");
        return ub.a.U((Enum[]) enumConstants);
    }
}

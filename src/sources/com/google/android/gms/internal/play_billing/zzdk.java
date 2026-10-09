package com.google.android.gms.internal.play_billing;

import b7.e0;
import hh.p0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdk extends zzfi implements zzgm {
    private static final zzdk zzb;
    private zzfn zzd = zzgt.f12422e;

    static {
        zzdk zzdkVar = new zzdk();
        zzb = zzdkVar;
        zzfi.m(zzdk.class, zzdkVar);
    }

    private zzdk() {
    }

    public static zzdj p() {
        return (zzdj) zzb.g();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void q(zzdk zzdkVar, ArrayList arrayList) {
        zzfn zzfnVar = zzdkVar.zzd;
        if (!zzfnVar.zzc()) {
            int size = zzfnVar.size();
            zzdkVar.zzd = zzfnVar.zzd(size + size);
        }
        List list = zzdkVar.zzd;
        Charset charset = zzfo.f12383a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i11 = zzgtVar.f12424c + size2;
            int length = zzgtVar.f12423b.length;
            if (i11 > length) {
                if (length != 0) {
                    while (length < i11) {
                        length = e0.c(length, 3, 2, 1, 10);
                    }
                    zzgtVar.f12423b = Arrays.copyOf(zzgtVar.f12423b, length);
                } else {
                    zzgtVar.f12423b = new Object[Math.max(i11, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            Object obj = arrayList.get(i12);
            if (obj == null) {
                String strH = p0.h(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(strH);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzdi.class});
        }
        if (i12 == 3) {
            return new zzdk();
        }
        if (i12 == 4) {
            return new zzdj(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}

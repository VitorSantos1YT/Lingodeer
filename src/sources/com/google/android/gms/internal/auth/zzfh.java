package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzfh extends zzfl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f9504c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private zzfh() {
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void a(long j11, Object obj) {
        Object objUnmodifiableList;
        List list = (List) zzhj.d(obj, j11);
        if (list instanceof zzff) {
            objUnmodifiableList = ((zzff) list).zze();
        } else {
            if (f9504c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzge) && (list instanceof zzez)) {
                zzez zzezVar = (zzez) list;
                if (zzezVar.zzc()) {
                    zzezVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzhj.j(obj, j11, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void b(Object obj, long j11, Object obj2) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) zzhj.d(obj2, j11);
        int size = list3.size();
        List list4 = (List) zzhj.d(obj, j11);
        if (list4.isEmpty()) {
            if (list4 instanceof zzff) {
                listZzd = new zzfe(size);
            } else {
                listZzd = ((list4 instanceof zzge) && (list4 instanceof zzez)) ? ((zzez) list4).zzd(size) : new ArrayList(size);
            }
            zzhj.j(obj, j11, listZzd);
            list2 = listZzd;
        } else {
            if (f9504c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzhj.j(obj, j11, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzhe) {
                zzfe zzfeVar = new zzfe(list4.size() + size);
                zzfeVar.addAll(zzfeVar.f9503b.size(), (zzhe) list4);
                zzhj.j(obj, j11, zzfeVar);
                list = zzfeVar;
            } else if ((list4 instanceof zzge) && (list4 instanceof zzez)) {
                zzez zzezVar = (zzez) list4;
                if (!zzezVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzez zzezVarZzd = zzezVar.zzd(list4.size() + size);
                    zzhj.j(obj, j11, zzezVarZzd);
                    list2 = zzezVarZzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zzhj.j(obj, j11, list3);
    }
}

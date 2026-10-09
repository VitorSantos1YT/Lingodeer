package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpi implements zzph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile zzon f11818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzpg f11819b;

    @Override // com.google.android.gms.internal.measurement.zzph
    public final zzpg a(final zzlk zzlkVar) {
        final zzon zzonVar = this.f11818a;
        zzon zzonVar2 = zzpg.f11809j;
        if (zzonVar != zzonVar2) {
            zzpe zzpeVar = zzpg.f11808i;
            zzpeVar.getClass();
            final zzpd zzpdVar = new zzpd();
            zzpdVar.f11805a = false;
            ConcurrentHashMap concurrentHashMap = zzpeVar.f11806a;
            Context context = zzlkVar.f11704b;
            String str = zzonVar.f11786d;
            if (str == null) {
                str = (String) zzonVar.f11783a.apply(context);
                zzonVar.f11786d = str;
            }
            zzoo zzooVar = (zzoo) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: com.google.android.gms.internal.measurement.zzpb
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    zzoo zzooVar2 = new zzoo(new zzpg(zzlkVar, zzonVar));
                    zzpdVar.f11805a = true;
                    return zzooVar2;
                }
            });
            if (zzpdVar.f11805a) {
                zzql.a(zzlkVar.f11704b, new zzoz(zzpeVar), new zzpa());
            }
            this.f11819b = zzooVar.f11787a;
            this.f11818a = zzonVar2;
        }
        return this.f11819b;
    }
}

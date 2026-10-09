package bq;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {
    public static void a(View view, long j11, fz.a aVar) {
        kotlin.jvm.internal.m.f(view, "<this>");
        view.postDelayed(new b2.c(4, view, aVar), j11);
    }

    public static void b(View view, fz.c cVar) {
        kotlin.jvm.internal.m.f(view, "<this>");
        view.setOnClickListener(new y(cVar));
    }
}

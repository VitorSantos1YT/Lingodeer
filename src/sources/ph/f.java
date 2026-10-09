package ph;

import et.c0;
import java.util.Objects;
import n9.e1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uz.j f46860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f46861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f46862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46863d;

    public f(uz.j jVar, String str, kotlin.jvm.internal.y yVar, k kVar, boolean z11) {
        this.f46860a = jVar;
        this.f46861b = yVar;
        this.f46862c = kVar;
        this.f46863d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.f46858b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f46858b = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, dVar);
            }
        } else {
            eVar = new e(this, dVar);
        }
        Object obj2 = eVar.f46857a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar.f46858b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            Objects.toString(this.f46861b.f38361a);
            e1 e1VarB = n9.m.b((e1) obj, new c0(this.f46862c, this.f46863d, (vy.d) null, 2));
            eVar.f46858b = 1;
            if (this.f46860a.emit(e1VarB, eVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
        }
        return b0.f48488a;
    }
}

package bp;

import com.lingo.fluent.ui.base.PdGrammarActivity;
import com.lingo.fluent.ui.base.PdVocabularyActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i11, Object obj, vy.d dVar, boolean z11) {
        super(2, dVar);
        this.f4642a = i11;
        this.f4645d = obj;
        this.f4644c = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4642a) {
            case 0:
                return new j((l) this.f4645d, dVar, 0);
            case 1:
                return new j(1, (vt.n0) this.f4645d, dVar, this.f4644c);
            case 2:
                return new j(2, (d1.z0) this.f4645d, dVar, this.f4644c);
            case 3:
                j jVar = new j((fr.v1) this.f4645d, dVar, 3);
                jVar.f4644c = ((Boolean) obj).booleanValue();
                return jVar;
            case 4:
                return new j(4, (gp.n0) this.f4645d, dVar, this.f4644c);
            case 5:
                return new j(5, (PdGrammarActivity) this.f4645d, dVar, this.f4644c);
            case 6:
                return new j(6, (PdVocabularyActivity) this.f4645d, dVar, this.f4644c);
            case 7:
                return new j(7, (rt.j2) this.f4645d, dVar, this.f4644c);
            default:
                return new j(this.f4644c, (l1.a1) this.f4645d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4642a) {
            case 0:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((j) create(bool, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0047 -> B:17:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0049
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4642a = i11;
        this.f4645d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z11, l1.a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f4642a = 8;
        this.f4644c = z11;
        this.f4645d = a1Var;
    }
}

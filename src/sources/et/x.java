package et;

import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.v f25925b;

    public /* synthetic */ x(jt.v vVar, int i11) {
        this.f25924a = i11;
        this.f25925b = vVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f25924a) {
            case 0:
                o courseTestDialogueSentence = (o) obj;
                kotlin.jvm.internal.m.f(courseTestDialogueSentence, "courseTestDialogueSentence");
                jt.v vVar = this.f25925b;
                vVar.getClass();
                x1.p pVar = vVar.f37218i;
                ry.m.N0(pVar);
                pVar.add(courseTestDialogueSentence);
                break;
            default:
                this.f25925b.f37214e.setValue(RecordingStatus.Recognizing.INSTANCE);
                break;
        }
        return qy.b0.f48488a;
    }
}

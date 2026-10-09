package bt;

import android.content.Context;
import android.widget.Toast;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h5 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5486a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy.e f5491f;

    public /* synthetic */ h5(jt.a2 a2Var, CourseWord courseWord, ot.a2 a2Var2, boolean z11, fz.f fVar) {
        this.f5488c = a2Var;
        this.f5489d = courseWord;
        this.f5490e = a2Var2;
        this.f5487b = z11;
        this.f5491f = fVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5486a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f5488c;
                fz.c cVar = (fz.c) this.f5490e;
                l1.b1 b1Var2 = (l1.b1) this.f5489d;
                fz.a aVar = (fz.a) this.f5491f;
                if (this.f5487b) {
                    RecordingStatus recordingStatus = (RecordingStatus) b1Var.getValue();
                    if (recordingStatus instanceof RecordingStatus.RecognizeShowScore) {
                        boolean z11 = ((RecordingStatus.RecognizeShowScore) recordingStatus).getSpeechScore() > 0.51f;
                        cVar.invoke(Boolean.valueOf(z11));
                        b1Var2.setValue(z11 ? ht.q.CORRECT : ht.q.WRONG);
                    }
                } else {
                    cVar.invoke(Boolean.TRUE);
                    aVar.invoke();
                }
                break;
            case 1:
                jt.a2 a2Var = (jt.a2) this.f5488c;
                CourseWord courseWord = (CourseWord) this.f5489d;
                ot.a2 a2Var2 = (ot.a2) this.f5490e;
                fz.f fVar = (fz.f) this.f5491f;
                a2Var.a(courseWord, false);
                ot.a2 a2Var3 = ot.a2.AudioWord;
                ot.a2 a2Var4 = ot.a2.AudioZhuYin;
                ot.a2 a2Var5 = ot.a2.AudioAudio;
                ot.a2 a2Var6 = ot.a2.WordTranslation;
                ot.a2 a2Var7 = ot.a2.WordZhuYin;
                if (ry.l.D(new ot.a2[]{a2Var3, a2Var4, a2Var5, a2Var6, a2Var7}, a2Var2) && (this.f5487b || !ry.l.D(new ot.a2[]{a2Var6, a2Var7}, a2Var2))) {
                    fVar.invoke(b7.e0.l(courseWord, "toString(...)"), Long.valueOf(courseWord.getWordId()), g8.Left);
                }
                break;
            default:
                fz.c cVar2 = (fz.c) this.f5490e;
                String str = (String) this.f5488c;
                Context context = (Context) this.f5489d;
                fz.a aVar2 = (fz.a) this.f5491f;
                if (this.f5487b) {
                    cVar2.invoke(str);
                    Toast.makeText(context, R.string.knowledge_note_saved_message, 0).show();
                    aVar2.invoke();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ h5(boolean z11, fz.c cVar, String str, Context context, fz.a aVar) {
        this.f5487b = z11;
        this.f5490e = cVar;
        this.f5488c = str;
        this.f5489d = context;
        this.f5491f = aVar;
    }

    public /* synthetic */ h5(boolean z11, l1.b1 b1Var, fz.c cVar, l1.b1 b1Var2, fz.a aVar) {
        this.f5487b = z11;
        this.f5488c = b1Var;
        this.f5490e = cVar;
        this.f5489d = b1Var2;
        this.f5491f = aVar;
    }
}

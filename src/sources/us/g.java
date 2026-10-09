package us;

import com.lingodeer.course.smarttips.data.model.DialogueType;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f53094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogueType f53095c;

    public /* synthetic */ g(DialogueType dialogueType, fz.c cVar) {
        this.f53093a = 0;
        this.f53095c = dialogueType;
        this.f53094b = cVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f53093a) {
            case 0:
                DialogueType dialogueType = this.f53095c;
                if (dialogueType.getElement().getAudio().length() > 0) {
                    this.f53094b.invoke(dialogueType.getElement().getAudio());
                }
                return b0.f48488a;
            case 1:
                this.f53094b.invoke(this.f53095c.getElement().getAudio());
                break;
            default:
                this.f53094b.invoke(this.f53095c.getElement().getAudio());
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ g(fz.c cVar, DialogueType dialogueType, int i11) {
        this.f53093a = i11;
        this.f53094b = cVar;
        this.f53095c = dialogueType;
    }
}

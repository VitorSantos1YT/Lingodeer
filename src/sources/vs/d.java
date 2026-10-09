package vs;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import av.n;
import com.lingodeer.course.smarttips.data.model.AudioExampleElement;
import com.lingodeer.course.smarttips.data.model.AudioExampleType;
import com.lingodeer.course.smarttips.data.model.DialogueElement;
import com.lingodeer.course.smarttips.data.model.DialogueType;
import com.lingodeer.course.smarttips.data.model.ImageExampleElement;
import com.lingodeer.course.smarttips.data.model.ImageExampleType;
import com.lingodeer.course.smarttips.data.model.TextExampleElement;
import com.lingodeer.course.smarttips.data.model.TextExampleType;
import e6.g0;
import kotlin.NoWhenBranchMatchedException;
import rz.e0;
import tp.f0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f54149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f54150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f54151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f54152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f54153e;

    public d(long j11, wt.m mVar, n nVar, k0 k0Var) {
        this.f54149a = j11;
        this.f54150b = nVar;
        this.f54151c = k0Var;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, (vy.d) null, 6), 3);
        i1 i1VarC = x0.c(-1);
        this.f54152d = i1VarC;
        this.f54153e = x0.A(x0.w(new no.g(x0.B(mVar.f(j11), new g0(3, 7, (vy.d) null)), i1VarC, new g0(this, (vy.d) null, 8)), yz.e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), a.f54147a);
        nVar.f3172c = new tp.e(this, 1);
    }

    public static final m a(d dVar, m mVar, boolean z11) {
        if (mVar instanceof f) {
            f fVar = (f) mVar;
            AudioExampleType audioExampleType = fVar.f54158a;
            AudioExampleType audioExampleType2 = AudioExampleType.copy$default(audioExampleType, null, null, AudioExampleElement.copy$default(audioExampleType.getElement(), null, null, null, null, z11, 15, null), 3, null);
            int i11 = fVar.f54159b;
            kotlin.jvm.internal.m.f(audioExampleType2, "audioExampleType");
            return new f(audioExampleType2, i11);
        }
        if (mVar instanceof g) {
            g gVar = (g) mVar;
            DialogueType dialogueType = gVar.f54160a;
            DialogueType dialogueType2 = DialogueType.copy$default(dialogueType, null, null, DialogueElement.copy$default(dialogueType.getElement(), null, null, null, null, z11, 15, null), 3, null);
            int i12 = gVar.f54161b;
            kotlin.jvm.internal.m.f(dialogueType2, "dialogueType");
            return new g(dialogueType2, i12);
        }
        if (mVar instanceof i) {
            i iVar = (i) mVar;
            ImageExampleType imageExampleType = iVar.f54164a;
            ImageExampleType imageExampleType2 = ImageExampleType.copy$default(imageExampleType, null, null, ImageExampleElement.copy$default(imageExampleType.getElement(), null, null, null, null, null, z11, 31, null), 3, null);
            int i13 = iVar.f54165b;
            kotlin.jvm.internal.m.f(imageExampleType2, "imageExampleType");
            return new i(imageExampleType2, i13);
        }
        if ((mVar instanceof j) || (mVar instanceof k)) {
            return mVar;
        }
        if (!(mVar instanceof l)) {
            if (mVar instanceof h) {
                return mVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        l lVar = (l) mVar;
        TextExampleType textExampleType = lVar.f54171a;
        TextExampleType textExampleType2 = TextExampleType.copy$default(textExampleType, null, null, TextExampleElement.copy$default(textExampleType.getElement(), null, null, null, z11, 7, null), 3, null);
        int i14 = lVar.f54172b;
        kotlin.jvm.internal.m.f(textExampleType2, "textExampleType");
        return new l(textExampleType2, i14);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f54150b.b();
    }
}

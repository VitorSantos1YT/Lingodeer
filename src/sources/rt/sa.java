package rt;

import java.util.List;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class sa implements ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50385a;

    public sa(List dialogueSentences) {
        kotlin.jvm.internal.m.f(dialogueSentences, "dialogueSentences");
        this.f50385a = dialogueSentences;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa) && kotlin.jvm.internal.m.a(this.f50385a, ((sa) obj).f50385a);
    }

    public final int hashCode() {
        return this.f50385a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f50385a, EHjhWcesDUIsIw.hMmqShfJmJqS, ")");
    }
}

package zr;

import com.lingodeer.data.model.CourseCharacter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseCharacter f59296a;

    public d(CourseCharacter character) {
        kotlin.jvm.internal.m.f(character, "character");
        this.f59296a = character;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.m.a(this.f59296a, ((d) obj).f59296a);
    }

    public final int hashCode() {
        return this.f59296a.hashCode();
    }

    public final String toString() {
        return "CharacterClicked(character=" + this.f59296a + ")";
    }
}

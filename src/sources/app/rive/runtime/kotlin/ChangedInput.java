package app.rive.runtime.kotlin;

import defpackage.e;
import fa.EQx.nuRcCS;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ChangedInput {
    public static final int $stable = 8;
    private final String name;
    private final String nestedArtboardPath;
    private final String stateMachineName;
    private final Object value;

    public ChangedInput(String stateMachineName, String name, Object obj, String str) {
        m.f(stateMachineName, "stateMachineName");
        m.f(name, "name");
        this.stateMachineName = stateMachineName;
        this.name = name;
        this.value = obj;
        this.nestedArtboardPath = str;
    }

    public static /* synthetic */ ChangedInput copy$default(ChangedInput changedInput, String str, String str2, Object obj, String str3, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = changedInput.stateMachineName;
        }
        if ((i11 & 2) != 0) {
            str2 = changedInput.name;
        }
        if ((i11 & 4) != 0) {
            obj = changedInput.value;
        }
        if ((i11 & 8) != 0) {
            str3 = changedInput.nestedArtboardPath;
        }
        return changedInput.copy(str, str2, obj, str3);
    }

    public final String component1() {
        return this.stateMachineName;
    }

    public final String component2() {
        return this.name;
    }

    public final Object component3() {
        return this.value;
    }

    public final String component4() {
        return this.nestedArtboardPath;
    }

    public final ChangedInput copy(String stateMachineName, String name, Object obj, String str) {
        m.f(stateMachineName, "stateMachineName");
        m.f(name, "name");
        return new ChangedInput(stateMachineName, name, obj, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangedInput)) {
            return false;
        }
        ChangedInput changedInput = (ChangedInput) obj;
        return m.a(this.stateMachineName, changedInput.stateMachineName) && m.a(this.name, changedInput.name) && m.a(this.value, changedInput.value) && m.a(this.nestedArtboardPath, changedInput.nestedArtboardPath);
    }

    public final String getName() {
        return this.name;
    }

    public final String getNestedArtboardPath() {
        return this.nestedArtboardPath;
    }

    public final String getStateMachineName() {
        return this.stateMachineName;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iD = e.d(this.stateMachineName.hashCode() * 31, 31, this.name);
        Object obj = this.value;
        int iHashCode = (iD + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.nestedArtboardPath;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(nuRcCS.RjEEwQZAnBAkA);
        sb2.append(this.stateMachineName);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", nestedArtboardPath=");
        return p0.o(sb2, this.nestedArtboardPath, ')');
    }

    public /* synthetic */ ChangedInput(String str, String str2, Object obj, String str3, int i11, f fVar) {
        this(str, str2, (i11 & 4) != 0 ? null : obj, (i11 & 8) != 0 ? null : str3);
    }
}

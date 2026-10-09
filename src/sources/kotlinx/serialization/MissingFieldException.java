package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List missingFields, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        m.f(missingFields, "missingFields");
        this.f38368a = missingFields;
    }
}

package qw;

import com.google.common.base.Preconditions;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f48457d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parser f48458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MessageLite f48459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48460c;

    public b(MessageLite messageLite) {
        Preconditions.k(messageLite, "defaultInstance cannot be null");
        this.f48459b = messageLite;
        this.f48458a = messageLite.j();
        this.f48460c = -1;
    }
}

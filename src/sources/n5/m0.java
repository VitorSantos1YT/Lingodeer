package n5;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.e f43319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f43320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileLock f43321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f43323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f43324f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43325t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, xy.c cVar) {
        super(cVar);
        this.f43324f = n0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43323e = obj;
        this.f43325t |= Integer.MIN_VALUE;
        return this.f43324f.a(null, this);
    }
}

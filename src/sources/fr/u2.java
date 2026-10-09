package fr;

import com.lingodeer.data.model.LastSyncTime;
import com.lingodeer.network.model.ApiResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u2 extends xy.c {
    public ApiResponse H;
    public ArrayList K;
    public /* synthetic */ Object L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i3 f27886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LastSyncTime f27889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f27890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f27891f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f27892t;

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.M |= Integer.MIN_VALUE;
        return a3.j(null, null, null, this);
    }
}

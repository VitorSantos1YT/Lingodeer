package com.google.firebase.database.connection;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CompoundHash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19054b;

    public CompoundHash(ArrayList arrayList, List list) {
        if (arrayList.size() != list.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f19053a = arrayList;
        this.f19054b = list;
    }
}

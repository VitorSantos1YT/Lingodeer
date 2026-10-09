package com.google.firebase.database;

import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.core.CompoundWrite;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.Repo;
import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.database.core.utilities.Pair;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.utilities.Validation;
import com.google.firebase.database.core.utilities.encoding.CustomClassMapper;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import com.google.firebase.database.snapshot.PriorityUtilities;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import no.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DatabaseReference extends Query {

    /* JADX INFO: renamed from: com.google.firebase.database.DatabaseReference$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.DatabaseReference$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface CompletionListener {
        void a(DatabaseError databaseError, DatabaseReference databaseReference);
    }

    public final DatabaseReference e(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        Path path = this.f18989b;
        if (path.isEmpty()) {
            Validation.b(str);
        } else {
            Validation.a(str);
        }
        return new DatabaseReference(this.f18988a, path.e(new Path(str)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof DatabaseReference) && toString().equals(obj.toString());
    }

    public final String f() {
        Path path = this.f18989b;
        if (path.isEmpty()) {
            return null;
        }
        return path.j().f19513a;
    }

    public final void g(final Transaction.Handler handler) {
        Validation.d(this.f18989b);
        this.f18988a.v(new Runnable() { // from class: com.google.firebase.database.DatabaseReference.4
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseReference databaseReference = DatabaseReference.this;
                databaseReference.f18988a.y(databaseReference.f18989b, handler);
            }
        });
    }

    public final Task h(Map map) {
        Path path = this.f18989b;
        Node nodeB = PriorityUtilities.b(path, null);
        Validation.d(path);
        new ValidationPath(path).e(map);
        Object objF = CustomClassMapper.f(map);
        Validation.c(objF);
        final Node nodeA = NodeUtilities.a(objF, nodeB);
        final Pair pairF = Utilities.f(null);
        this.f18988a.v(new Runnable() { // from class: com.google.firebase.database.DatabaseReference.1
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseReference databaseReference = DatabaseReference.this;
                databaseReference.f18988a.x(databaseReference.f18989b, nodeA, (CompletionListener) pairF.f19422b);
            }
        });
        return (Task) pairF.f19421a;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final void i(HashMap map, c cVar) {
        Object objF = CustomClassMapper.f(map);
        char[] cArr = Utilities.f19432a;
        final Map map2 = (Map) objF;
        Pattern pattern = Validation.f19434a;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map2.entrySet()) {
            Path path = new Path((String) entry.getKey());
            Object value = entry.getValue();
            new ValidationPath(this.f18989b.e(path)).e(value);
            String str = !path.isEmpty() ? path.j().f19513a : com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
            if (str.equals(".sv") || str.equals(".value")) {
                throw new DatabaseException("Path '" + path + "' contains disallowed child name: " + str);
            }
            Node nodeB = str.equals(".priority") ? PriorityUtilities.b(path, value) : NodeUtilities.a(value, EmptyNode.f19537e);
            Validation.c(value);
            treeMap.put(path, nodeB);
        }
        Path path2 = null;
        for (Path path3 : treeMap.keySet()) {
            if (path2 != null) {
                path2.compareTo(path3);
            }
            char[] cArr2 = Utilities.f19432a;
            if (path2 != null && path2.h(path3)) {
                throw new DatabaseException("Path '" + path2 + "' is an ancestor of '" + path3 + "' in an update.");
            }
            path2 = path3;
        }
        final CompoundWrite compoundWriteH = CompoundWrite.h(treeMap);
        final Pair pairF = Utilities.f(cVar);
        this.f18988a.v(new Runnable() { // from class: com.google.firebase.database.DatabaseReference.3
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseReference databaseReference = DatabaseReference.this;
                databaseReference.f18988a.z(databaseReference.f18989b, compoundWriteH, (CompletionListener) pairF.f19422b, map2);
            }
        });
    }

    public final String toString() {
        Path pathL = this.f18989b.l();
        Repo repo = this.f18988a;
        DatabaseReference databaseReference = pathL != null ? new DatabaseReference(repo, pathL) : null;
        if (databaseReference == null) {
            return repo.f19216a.toString();
        }
        try {
            return databaseReference.toString() + "/" + URLEncoder.encode(f(), Constants.ENCODING).replace("+", "%20");
        } catch (UnsupportedEncodingException e8) {
            throw new DatabaseException("Failed to URLEncode key: " + f(), e8);
        }
    }
}

package com.google.firebase.inappmessaging.internal;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtoStorageClient f20262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20263c;

    public /* synthetic */ t(ProtoStorageClient protoStorageClient, Object obj, int i11) {
        this.f20261a = i11;
        this.f20262b = protoStorageClient;
        this.f20263c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20261a) {
            case 0:
                ProtoStorageClient protoStorageClient = this.f20262b;
                AbstractMessageLite abstractMessageLite = (AbstractMessageLite) this.f20263c;
                synchronized (protoStorageClient) {
                    FileOutputStream fileOutputStreamOpenFileOutput = protoStorageClient.f20051a.openFileOutput(protoStorageClient.f20052b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(abstractMessageLite.n());
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th2) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            break;
                        }
                        throw th2;
                    }
                }
                return abstractMessageLite;
            default:
                ProtoStorageClient protoStorageClient2 = this.f20262b;
                Parser parser = (Parser) this.f20263c;
                synchronized (protoStorageClient2) {
                    try {
                        try {
                            FileInputStream fileInputStreamOpenFileInput = protoStorageClient2.f20051a.openFileInput(protoStorageClient2.f20052b);
                            try {
                                AbstractMessageLite abstractMessageLite2 = (AbstractMessageLite) parser.b(fileInputStreamOpenFileInput);
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                return abstractMessageLite2;
                            } catch (Throwable th4) {
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                    break;
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    } catch (InvalidProtocolBufferException | FileNotFoundException e8) {
                        e8.getMessage();
                        return null;
                    }
                }
        }
    }
}

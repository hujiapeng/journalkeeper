package com.jd.journalkeeper.rpc.client;

import java.util.concurrent.CompletableFuture;

/**
 * Client调用Server的RPC
 * @author liyue25
 * Date: 2019-03-14
 */
public interface ClientServerRpc<E, Q, R> {

    CompletableFuture<UpdateClusterStateResponse> updateClusterState(UpdateClusterStateRequest<E> request);
    CompletableFuture<QueryStateResponse<R>> queryClusterState(QueryStateRequest<Q> request);
    CompletableFuture<QueryStateResponse<R>> queryServerState(QueryStateRequest<Q> request);
    CompletableFuture<LastAppliedResponse> lastApplied();
    CompletableFuture<QueryStateResponse<R>> querySnapshot(QueryStateRequest<Q> request);
    CompletableFuture<GetServersResponse> getServer();
    CompletableFuture<UpdateVotersResponse> updateVoters(UpdateVotersRequest request);
    CompletableFuture<UpdateObserversResponse> updateObservers(UpdateObserversRequest request);
}

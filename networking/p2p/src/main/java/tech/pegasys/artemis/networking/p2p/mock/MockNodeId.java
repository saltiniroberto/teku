/*
 * Copyright 2019 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package tech.pegasys.artemis.networking.p2p.mock;

import org.apache.tuweni.bytes.Bytes;
import tech.pegasys.artemis.networking.p2p.peer.NodeId;

public class MockNodeId implements NodeId {
  private final Bytes bytes = Bytes.fromHexString("0x00", 32);
  private final String base58 = "11111111111111111111111111111111";

  @Override
  public Bytes toBytes() {
    return bytes;
  }

  @Override
  public String toBase58() {
    return base58;
  }

  @Override
  public String toString() {
    return toBase58();
  }
}

import { Button, Text, View } from "react-native";

export default function Index() {
  return (
    <View>
      <Text>Hello world from React Native👋</Text>
      <Button title="Hello" onPress={() => alert("Pressed")} />
    </View>
  );
}
